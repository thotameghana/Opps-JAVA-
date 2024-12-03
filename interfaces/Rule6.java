package com.megha.interfaces;

//A class can implement multiple interfaces because there is not diamond shape problem
interface Demo5{
	void add();
}
interface Demo6{
	void sub();
}
class Demo7 implements Demo5,Demo6{
	@Override
	public void add() {
		System.out.println("Adding");
	}
	@Override
	public void sub() {
		System.out.println("Subtracting");
	}
}
public class Rule6 {
	public static void main(String[] args) {
		Demo7 d=new Demo7();
		d.add();
		d.sub();
	}
}
