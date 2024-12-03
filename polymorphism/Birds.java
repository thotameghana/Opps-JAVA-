package com.megha.Polymorphism;


class Bird{
	void eat() {
		System.out.println("birds will eat");
	}
	void sleep() {
		System.out.println("Birds will sleep");
	}
}
class Parrot extends Bird{
	@Override
	public void eat() {
		System.out.println("parrot will eat guva");
	}
	@Override
	public void sleep() {
		System.out.println("parrot will sleep");
	}
	public void look() {
		System.out.println("parrot will look beatiful");
	}
}

public class Birds {
	public static void main(String[] args) {
		Bird b=new Parrot();
		b.eat();
		b.sleep();
		//down casting
		((Parrot)(b)).look();
	}
}
