package com.megha.interfaces;

//an interface can extends another interface
//By using this we can achieve multiple inheritance indirectly
interface Demo9{
	void add();
	void sub();
}
interface Demo10 extends Demo9{
	void mul();
	void div();
}
class Arthemetic1 implements Demo10{
	@Override
	public void add() {
		System.out.println("Adding");
	}
	@Override
	public void sub() {
		System.out.println("Subtracting");
	}
	@Override
	public void mul() {
		System.out.println("Multiplying");
	}
	@Override
	public void div() {
		System.out.println("Divivsion");
	}
	
}
public class Rule8 {
	public static void main(String[] args) {
		Arthemetic1 a = new Arthemetic1();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}

}
