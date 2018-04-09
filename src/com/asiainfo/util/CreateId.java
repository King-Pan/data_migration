package com.asiainfo.util;

import java.util.Date;

import com.jcraft.jsch.jce.Random;

public class CreateId {
	
	
	public String[] createId(){
	String[] s = new String[6];
	Date date = new Date();
	Random random1 = new Random();
	Md5 t = new Md5();
	for(int i=0;i<s.length;i++){
		s[i] = t.getMd5(String.valueOf(date.getTime())+Math.random()).substring(1, 17);
	}
	return s;
	}
	
	public static void main(String[] args) {
		CreateId t = new CreateId();
		String[] ss = t.createId();
		for(int i=0;i<ss.length;i++){
		System.out.println(ss[i]);
		}
	}
}
