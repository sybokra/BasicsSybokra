package com.sybokra.basics.operators;


class Tank{
	int level;
}
class Letter{
	char c;
}

/**
 * 赋值操作之"别名现象"
 * @author curtin 2019-04-15 23:14:36
 *
 */
public class TestAssignment {
	
	public static void main(String[] args) {
		TestAssignment ta = new TestAssignment();
		System.out.println("assignment():");
		ta.assignment();
		System.out.println("passObject():");
		ta.passObject();
	}
	
	public void assignment() {
		System.out.println("========test1========");
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("test1: t1.level:" + t1.level + " , t2.level:" + t2.level);
		
		System.out.println("========test2========");
		t1 = t2;
		System.out.println("test2: t1.level:" + t1.level + " , t2.level:" + t2.level);
		
		System.out.println("========test3========");
		t1.level = 27;
		System.out.println("test3: t1.level:" + t1.level + " , t2.level:" + t2.level);
		/*
		  由于赋值操作的是一个对象的引用，所以修改t1的同时也会改变t2，这是由于t1和t2包含相同的引用，它们指向相同的对象
		  这种特殊的现象通常叫作"别名现象"
		
		  为了避免别名现象，可以这么写：t1.level = t2.level；
		  这样便可以保持两个对象的相互独立
		 */
	}
	
	public void passObject() {
		Letter x = new Letter();
		System.out.println("========test4========");
		x.c = 'a';
		System.out.println("test4: x.c:" +x.c);
		System.out.println("========test5========");
		f(x);
		System.out.println("test5: x.c:" +x.c);
		/*
		 * 方法f()似乎要在它的作用域内赋值其参数Letter y的一个副本；但实际上只是传递了一个引用，所以test5实际改变的是f()之外的对象
		 */
	}

	static void f(Letter y) {
		y.c = 'z';
	}
}
