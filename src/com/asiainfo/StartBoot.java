package com.asiainfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.asiainfo.model.DisInfo;
import com.asiainfo.model.StepInfo;
import com.asiainfo.model.UnitInfo;
import com.asiainfo.util.Md5;
import com.asiainfo.util.WriteSql;
import com.asiainfo.util.WriteStepSql;
import com.asiainfo.util.XmlStep;
import com.asiainfo.util.XmlUnit;
import com.jcraft.jsch.jce.Random;


public class StartBoot {

    public static Properties prop = new Properties();
    public static XmlUnit xu = new XmlUnit();
    public static XmlStep xs = new XmlStep();
    public static WriteSql ws = new WriteSql();
    public static WriteStepSql ss = new WriteStepSql();
    private static List<Map<String, String>> list = new ArrayList<Map<String, String>>();

    public static void main(String[] args) {
        String proPath = System.getProperty("user.dir") + File.separator + "cfg.properties";
        System.out.println("配置文件路径====》" + proPath);
        try {
            FileInputStream in = new FileInputStream(proPath);
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String DB_URL = prop.getProperty("DB_URL").trim();
        String DB_USER = prop.getProperty("DB_USER").trim();
        String DB_PWD = prop.getProperty("DB_PWD").trim();
        String DB_DRIVER = prop.getProperty("DB_DRIVER").trim();


        ResultSet rs = null;
        Connection conn = null;
        Statement stmt = null;
        String sql = "";

        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            stmt = conn.createStatement();
            sql = "select dis_id,dis_code,dis_name,source_dbname,source_tablename,call_cycle_type,call_time,source_xmlid,export_sql,target_type,target_dbname,target_tablename,target_tablecycle,target_tableidx_col,target_tableidx_name,target_xmlid,load_type,operate_sql,template_table,partition_key,table_space,schema_name,host_name,target_dir,file_delimiter,delimiter_size,dis_type,af_action,cfg_remark,cur_creater,team_code,is_active,redo_times,date_col,map_num,over_time,offsetend,ftp_host,exp_file_name,ftp_file_path,dis_level,is_temp from distribute_cfg_oracle  t where t.CALL_CYCLE_TYPE='month' and t.IS_ACTIVE='1' and t.TEAM_CODE='T00039' ";
            System.out.println("获取分发配置sql" + sql);
            rs = stmt.executeQuery(sql);
            ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
            int columnCount = md.getColumnCount();   //获得列数
            while (rs.next()) {
                Map<String, String> rowData = new HashMap<String, String>();
                for (int i = 1; i <= columnCount; i++) {
                    if (rs.getObject(i) != null) {
                        rowData.put(md.getColumnName(i).toString(), (String) rs.getObject(i).toString());
                    }

                }
                list.add(rowData);

            }

        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }

        for (Map<String, String> lists : list) {
            DisInfo info = new DisInfo(lists);

            Date date = new Date();
            Random random1 = new Random();
            Md5 t = new Md5();
            String s = t.getMd5(String.valueOf(date.getTime())).substring(1, 17);
            String cycle = info.getCall_cycle_type();
            if (cycle == "day") {
                cycle = "daily";
            } else if (cycle == "month") {
                cycle = "monthly";
            }
            UnitInfo uinfo = new UnitInfo();
            uinfo.setId(s);
            uinfo.setUnit_code(info.getTarget_tablename());
            uinfo.setVersion("0");
            uinfo.setLabel(info.getDis_name());
            uinfo.setDescr(info.getDis_name());
            uinfo.setUnit_type("2");
            uinfo.setWorkgroup("");
            uinfo.setBatch_type(cycle);
            uinfo.setBatch_step("1");
            uinfo.setBatch_offset("-1");
            uinfo.setBatch_no(info.getDate_col());
            uinfo.setUnit_priority("0");
            uinfo.setRun_constraint("");
            uinfo.setMember_id("T00039-wangzongjie");
            uinfo.setCreate_user("zhangguangl");
            uinfo.setCreate_dt("now()");
            uinfo.setLastupd("now()");
            uinfo.setUnit_ext_cfg("");
            String cx[] = xu.readToString();
            String sx = xu.readToString()[5];
            uinfo.setGraph(sx);
            uinfo.setState("0");
            uinfo.setTmpl_code("915132deb86d974f");
            uinfo.setUpdate_dt("now()");

            String sqll = ws.InstallSql(uinfo);
            ws.WriteTxt(sqll);


            StepInfo sinfo = new StepInfo();
            for (int i = 0; i < cx.length - 1; i++) {
                if (i == 0) {
                    System.out.println(">>>>>>>>>Step1 开始组装！！！");
                    sinfo.setId(cx[0]);
                    sinfo.setUnit_id(s);
                    sinfo.setUnit_code(info.getDis_name());
                    sinfo.setStep_idx("1");
                    sinfo.setStep_label("表到达");
                    sinfo.setStep_inst("tableArrival");
                    sinfo.setStep_type("sched");
                    sinfo.setNext_step_idx("2");
                    sinfo.setPre_step_idx("-1");
                    sinfo.setIgnore_err_idx("");
                    sinfo.setParent_step_idx("");
                    System.out.println("DisInfo----->"+info);
                    String so = xs.readToStringStep1(info.getSource_dbname(), info.getSource_xmlid());
                    sinfo.setStep_cfg_val(so);
                    sinfo.setRequired_props("[\"dsName\",\"stateExpr\"]");
                    String stepSql = ss.InstallStepSql(sinfo);
                    ss.WriteStepTxt(stepSql);

                } else if (i == 1) {
                    System.out.println(">>>>>>>>>Step2 开始组装！！！");
                    sinfo.setId(cx[i]);
                    sinfo.setUnit_id(s);
                    sinfo.setUnit_code(info.getDis_name());
                    sinfo.setStep_idx("2");
                    sinfo.setStep_label("hive导出到Hdfs");
                    sinfo.setStep_inst("sql");
                    sinfo.setStep_type("dp");
                    sinfo.setNext_step_idx("3");
                    sinfo.setPre_step_idx("1");
                    sinfo.setIgnore_err_idx("");
                    sinfo.setParent_step_idx("");
                    String so = xs.readToStringStep2(info.getSource_dbname(), info.getExport_sql());
                    sinfo.setStep_cfg_val(so);
                    sinfo.setRequired_props("[\"dsName\",\"sql\"]");
                    String stepSql = ss.InstallStepSql(sinfo);
                    ss.WriteStepTxt(stepSql);
                } else if (i == 2) {
                    System.out.println(">>>>>>>>>Step3 开始组装！！！");
                    sinfo.setId(cx[i]);
                    sinfo.setUnit_id(s);
                    sinfo.setUnit_code(info.getDis_name());
                    sinfo.setStep_idx("3");
                    sinfo.setStep_label("分片");
                    sinfo.setStep_inst("shard");
                    sinfo.setStep_type("shard");
                    sinfo.setNext_step_idx("-1");
                    sinfo.setPre_step_idx("2");
                    sinfo.setIgnore_err_idx("");
                    sinfo.setParent_step_idx("");
                    String so = xs.readToStringStep3(info.getSource_tablename());
                    sinfo.setStep_cfg_val(so);
                    sinfo.setRequired_props("[\"shardCnt\",\"strg\",\"contents\"]");
                    String stepSql = ss.InstallStepSql(sinfo);
                    ss.WriteStepTxt(stepSql);
                } else if (i == 3) {
                    System.out.println(">>>>>>>>>Step4 开始组装！！！");
                    sinfo.setId(cx[i]);
                    sinfo.setUnit_id(s);
                    sinfo.setUnit_code(info.getDis_name());
                    sinfo.setStep_idx("4");
                    sinfo.setStep_label("HDFS抽取");
                    sinfo.setStep_inst("hdfsreader");
                    sinfo.setStep_type("datax");
                    sinfo.setNext_step_idx("5");
                    sinfo.setPre_step_idx("-1");
                    sinfo.setIgnore_err_idx("");
                    sinfo.setParent_step_idx("3");
                    String so = xs.readToStringStep4(info.getSource_tablename());
                    sinfo.setStep_cfg_val(so);
                    sinfo.setRequired_props("[\"isRelyPre\",\"dsName\",\"path\",\"fileType\",\"encoding\",\"compress\",\"isEditColumn\",\"column\",\"nullFormat\",\"fieldDelimiter\",\"csvReaderConfig\"]");
                    String stepSql = ss.InstallStepSql(sinfo);
                    ss.WriteStepTxt(stepSql);

                } else if (i == 4) {
                    System.out.println(">>>>>>>>>Step5 开始组装！！！");
                    sinfo.setId(cx[i]);
                    sinfo.setUnit_id(s);
                    sinfo.setUnit_code(info.getDis_name());
                    sinfo.setStep_idx("5");
                    sinfo.setStep_label("ORACLE加载");
                    sinfo.setStep_inst("oraclewriter");
                    sinfo.setStep_type("datax");
                    sinfo.setNext_step_idx("-1");
                    sinfo.setPre_step_idx("4");
                    sinfo.setIgnore_err_idx("");
                    sinfo.setParent_step_idx("3");
                    String so = xs.readToStringStep5(info.getTarget_dbname(), info.getTarget_tablename(), info.getOperate_sql());
                    sinfo.setStep_cfg_val(so);
                    sinfo.setRequired_props("[\"dsName\",\"table\",\"column\",\"preSql\",\"postSql\"]");
                    String stepSql = ss.InstallStepSql(sinfo);
                    ss.WriteStepTxt(stepSql);
                }
            }


        }


    }

}
