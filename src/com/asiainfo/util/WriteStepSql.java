package com.asiainfo.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.asiainfo.model.StepInfo;
import com.asiainfo.model.UnitInfo;

public class WriteStepSql {
	
	String stepPath = System.getProperty("user.dir")+File.separator+"step.sql";
	
	public String InstallStepSql(StepInfo t){
		String sql = "INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('"
					+ t.getId() +"','"
					+ t.getUnit_id() +"','"
					+ t.getUnit_code() +"','"
					+ t.getStep_idx() +"','"
					+ t.getStep_label() +"','"
					+ t.getStep_inst() +"','"
					+ t.getStep_type() +"','"
					+ t.getNext_step_idx() +"','"
					+ t.getPre_step_idx() +"','"
					+ t.getIgnore_err_idx() +"','"
					+ t.getParent_step_idx() +"','"
					+ t.getStep_cfg_val() +"','"
					+ t.getRequired_props() +"');\n";
					
		return sql;
	}
	
	public void WriteStepTxt(String s){
		try { 

            /* 写入Txt文件 */  
            File writename = new File(stepPath); // 相对路径，如果没有则要建立一个新的output。txt文件  
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
