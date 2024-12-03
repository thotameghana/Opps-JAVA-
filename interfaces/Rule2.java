package com.megha.interfaces;


//We can promote polymorphism by loose coupling here Demo2 is not a parent class
//but it act's like a parent
interface Demo2{
	void add();
	void sub();
}
class Calc1 implements Demo2{
	@Override
	public void add() {
		System.out.println("Adding");
	}
	@Override
	public void sub() {
		System.out.println("Subtracting");
	}
}
class Calc2 implements Demo2{
	@Override
	public void add() {
		System.out.println(100+200);
	}
	@Override
	public void sub() {
		System.out.println(200-100);
	}
}
class Calculate{
	void calc(Demo2 ref) {
		ref.add();
		ref.sub();
	}
}
public class Rule2 {
	public static void main(String[] args) {
		Calc1 c1 = new Calc1();
		Calc2 c2 = new Calc2();
		
		Calculate c = new Calculate();
		c.calc(c1);
		c.calc(c2);
	}
}
