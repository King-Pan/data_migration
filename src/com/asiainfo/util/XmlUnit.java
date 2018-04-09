package com.asiainfo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class XmlUnit { 
	private static CreateId ci = new CreateId();
	public String[] readToString(){
		String proPath = System.getProperty("user.dir")+File.separator+"unit_xml";
		String encoding = "UTF-8";  
        File file = new File(proPath);  
        Long filelength = file.length();  
        byte[] filecontent = new byte[filelength.intValue()];  
        try {  
            FileInputStream in = new FileInputStream(file);  
            in.read(filecontent);  
            in.close();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        try {  
            String tx = new String(filecontent, encoding); 
            String[] ss = ci.createId();
            String ta = tx.replace("${step1}", ss[0]);
            String tb = ta.replace("${step2}", ss[1]);
            String tc = tb.replace("${step3}", ss[2]);
            String td = tc.replace("${step4}", ss[3]);
            String te = td.replace("${step5}", ss[4]);
            ss[5] = te;
            return ss;
        } catch (UnsupportedEncodingException e) {  
            System.err.println("The OS does not support " + encoding);  
            e.printStackTrace();  
            return null;  
        }  
	}
	
	public static void main(String[] args) {
		XmlUnit s = new XmlUnit();
		String b = s.readToString()[0];
		System.out.println(b);
	}
	
}
