package com.asiainfo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

import com.asiainfo.model.UnitInfo;

public class WriteSql {
	
	String unitPath = System.getProperty("user.dir")+File.separator+"unit.sql";
	
	public String InstallSql(UnitInfo t){
		
		String sql = "INSERT INTO DACP_DATASTASH_UNIT (ID, UNIT_CODE, VERSION, LABEL, DESCR, UNIT_TYPE, WORKGROUP, BATCH_TYPE, BATCH_STEP, BATCH_OFFSET, BATCH_NO, UNIT_PRIORITY, RUN_CONSTRAINT, MEMBER_ID, CREATE_USER, CREATE_DT, LASTUPD, UNIT_EXT_CFG, GRAPH, STATE,UPDATE_DT , TMPL_CODE) VALUES ('"
				 + t.getId() + "','"
				 + t.getUnit_code() + "','"
				 + t.getVersion() + "','"
				 + t.getLabel() + "','"
				 + t.getDescr() + "','"
				 + t.getUnit_type() + "','"
				 + t.getWorkgroup() + "','"
				 + t.getBatch_type() + "','"
				 + t.getBatch_step() + "','"
				 + t.getBatch_offset() + "','"
				 + t.getBatch_no() + "','"
				 + t.getUnit_priority() + "','"
				 + t.getRun_constraint() + "','"
				 + t.getMember_id() + "','"
				 + t.getCreate_user() + "',"
				 + t.getCreate_dt() + ","
				 + t.getLastupd() + ",'"
				 + t.getUnit_ext_cfg() + "','"
				 + t.getGraph() + "','"
				 + t.getState() + "',"
				 + t.getUpdate_dt() + ",'"
				 + t.getTmpl_code() + "');\n" ;
		
		return sql;
				
		
	}
	
	public void WriteTxt(String s){
		try { 

            /* 写入Txt文件 */  
            File writename = new File(unitPath); // 相对路径，如果没有则要建立一个新的output。txt文件  
            if (writename.exists()) {    
                System.out.print("文件存在");    
            } else {    
                System.out.print("文件不存在");    
                writename.createNewFile();// 不存在则创建    
            }  
              
            BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));  
            out.write(s); // \r\n即为换行  
            out.flush(); // 把缓存区内容压入文件  
            out.close(); // 最后记得关闭文件  

        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}

}
