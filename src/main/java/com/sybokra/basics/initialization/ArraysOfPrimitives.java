package com.sybokra.basics.initialization;

/**
 * 复制数组的引用
 * @author curtin 2019-05-03 11:14:47
 *
 */
public class ArraysOfPrimitives {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		a2 = a1;
		for(int i = 0;i < a2.length; i++) {
			a2[i] = a2[i]  + 1;
		}
		for(int i = 0;i < a1.length; i++) {
			System.out.println("a1[" + i + "]=" + a1[i]);
		}
	}

}
