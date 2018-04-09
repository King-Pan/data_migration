package com.asiainfo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class XmlStep {

    public String readToStringStep1(String s, String a) {
        String proPath = System.getProperty("user.dir") + File.separator + "step1_xml";
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
            String sa = tx.replace("${sourcedb}", s);
            String se = sa.replace("${sourcexmlid}", a);
            return sa;
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

    public String readToStringStep2(String a, String b) {
        String proPath = System.getProperty("user.dir") + File.separator + "step2_xml";
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
            String sa = tx.replace("${sourcedb}", a);
            String sb = sa.replace("${sql}", b);
            return sb;
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

    public String readToStringStep3(String a) {
        String proPath = System.getProperty("user.dir") + File.separator + "step3_xml";
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
            String sa = tx.replace("${sourcetablename}", a);
            return sa;
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

    public String readToStringStep4(String a) {
        String proPath = System.getProperty("user.dir") + File.separator + "step4_xml";
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
            String sa = tx.replace("${sourcetbname}", a);
            return sa;
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }


    public String readToStringStep5(String a, String b, String c) {
        String proPath = System.getProperty("user.dir") + File.separator + "step5_xml";
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
            String sa = tx.replace("${targetdbname}", a);
            String sb = sa.replace("${targettbname}", b);
            String sc = sb.replace("${redosql}", c);
            return sc;
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

}
