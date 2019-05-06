package com.sybokra.basics.initialization;

/**
 * 可变参数列表
 * @author curtin 2019-05-03 15:01:11
 *
 */
public class OptionalTrailingArguments {

	static void f(int required , String... trailing) {
		System.out.print("required:[" + required + "] trailing.length:[" +trailing.length+"] [");
		for (String s : trailing) {
			System.out.print(s + " ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		f(1, "one");
		f(2, "two","three");
		f(0);
	}

}
