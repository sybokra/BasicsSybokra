package com.sybokra.basics.operators;

import java.util.Date;

/**
 * 
 * @author curtin 2019-04-14 14:34:05
 * 从系统获取信息
 */
public class TestSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========当前时间：============");
		System.out.println(new Date());
		System.out.println("===========从运行程序的系统中获取所有属性（可提供环境信息）：===========");
		System.getProperties().list(System.out);
		System.out.println("==========获取用户名：============");
		System.out.println(System.getProperty("user.name"));
		System.out.println("===========获取java路径：===========");
		System.out.println(System.getProperty("java.library.path"));
		System.out.println("==========获取系统：============");
		System.out.println(System.getProperty("os.name"));
		
	}

}
