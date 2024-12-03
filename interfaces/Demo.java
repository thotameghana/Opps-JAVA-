package com.megha.interfaces;

import java.util.Scanner;

//Interfaces are used to achieve standardization
interface Calculator{
	void add();
	void sub();
}
class Calculator1 implements Calculator{
	@Override
	public void add() {
		System.out.println(200+100);
	}
	@Override
	public void sub() {
		System.out.println(200-100);
	}
	public void mul() {
		System.out.println("Hello");
	}
	
}
class Calculator2 implements Calculator{
	@Override
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1");
		int a=sc.nextInt();
		System.out.println("Enter the value of num2");
		int b=sc.nextInt();
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1");
		int a=sc.nextInt();
		System.out.println("Enter the value of num2");
		int b=sc.nextInt();
		System.out.println(a-b);
	} 	
	public void mul() {
		System.out.println("Hello");
	}
}
class Calculator3 implements Calculator{
	@Override
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1");
		int a=sc.nextInt();
		System.out.println("Enter the value of num2");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+b);
		}
		else {
			System.out.println("INvalid input");
		}
	}
	@Override
	public void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1");
		int a=sc.nextInt();
		System.out.println("Enter the value of num2");
		int b=sc.nextInt();
		if(b>a) {
			System.out.println(b-a);
		}
		else {
			System.out.println("Invalid input");
		}
	}
	public void mul() {
		System.out.println("Hello");
	}
}
class Casio{
	void calculate(Calculator c) {
		c.add();
		c.sub();
	}
}
public class Demo {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		Calculator2 c2 = new Calculator2();
		Calculator3 c3 = new Calculator3();
		
		Casio c = new Casio();
		c.calculate(c1);
		c.calculate(c2);
		c.calculate(c3);
	}
}
