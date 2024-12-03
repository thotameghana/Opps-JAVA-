package com.megha.interfaces;

//A class can extend another class as well as it can implements an interface but 1st extends and then implements
interface Demo11{
	void add();
	void sub();
}
class Demo12{
	void mul() {
		System.out.println("Multiplication");
	}
	void div() {
		System.out.println("Division");
	}
}
class Arthemetic3 extends Demo12 implements Demo11{
	@Override
	public void add() {
		System.out.println("Adding");
	}
	@Override
	public void sub() {
		System.out.println("Subtracting");
	}
}
public class Rule9 {
	public static void main(String[] args) {
		Arthemetic3 a = new Arthemetic3();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}
}
