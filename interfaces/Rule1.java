package com.megha.interfaces;

//Interface is like a contract we can achieve Standardization
interface Demo1{
	void add();
	void sub();
}
class Calc implements Demo1{
	@Override
	public void add() {
		System.out.println("Adding");
	}
	@Override
	public void sub() {
		System.out.println("Subtracting");
	}
}
public class Rule1 {
	public static void main(String[] args) {
		Calc c=new Calc();
		c.add();
		c.sub();
	}
}
