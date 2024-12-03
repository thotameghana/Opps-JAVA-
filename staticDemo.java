package com.opps;

class Demo{
	static int a,b;
	static
	{
		System.out.println("I'm static block");
	}
	static void function1() {
		System.out.println("I'm static method");
	}
	int x,y;
	{
		System.out.println("I'm instance block");
	}
	void function2() {
		System.out.println("I'm non static function");
	}
	public Demo(){
		x=10;
		y=20;
		System.out.println("I'm constructor");
	}
	
}
public class staticDemo {
	static {
		System.out.println("static block");
	}
	static void fun1(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
//		Demo.function1();
//		Demo d=new Demo();
//		d.function2();
//		
		fun1();
		System.out.println("Main method");
	}

}
