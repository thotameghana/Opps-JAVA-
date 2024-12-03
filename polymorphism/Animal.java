package com.megha.Polymorphism;

class Animal1{
	void eat() {
		System.out.println("Animal's will eat");
	}
	void sleep() {
		System.out.println("Animal's will sleep");
	}
}
class Deer extends Animal1{
	@Override
	void eat() {
		System.out.println("Deer is a herbivores");
	}
	@Override
	void sleep() {
		System.out.println("Deer will sleep fully");
	}
}
class Tiger extends Animal1{
	@Override
	void eat() {
		System.out.println("Tiger is Carnivores");
	}
	@Override
	void sleep() {
		System.out.println("Tiger will sleep less time");
	}
}
class Monkey extends Animal1{
	@Override
	void eat() {
		System.out.println("Monkey is Omnivores");
	}
	@Override
	void sleep() {
		System.out.println("Monkey will sleep at night times");
	}
}
class Forest{
	void display(Animal1 ref) {
		ref.eat();
		ref.sleep();
	}
}
public class Animal {
	public static void main(String[] args) {
		
		Forest f = new Forest();
		
		Deer d=new Deer();
		Tiger t = new Tiger();
		Monkey m = new Monkey();
		System.out.println(f);
		
		f.display(d);
		f.display(t);
		f.display(m);
		
		
		
		//One way to achieve polymorpism
//		Deer d = new Deer();
//		ref=d;
//		ref.eat();
//		ref.sleep();
//		
//		Tiger t = new Tiger();
//		ref=t;
//		ref.eat();
//		ref.sleep();
//		
//		Monkey m = new Monkey();
//		ref=m;
//		ref.eat();
//		ref.sleep();
		
		
		

	}
}
