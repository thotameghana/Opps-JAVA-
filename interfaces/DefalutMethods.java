package com.megha.interfaces;

//Java-8 or JDK-8
//Y default methods: "To facilitate backward compatibility"
//default methods inherited and overridden
//By default access modifier of default methods are public 
interface Dog{
	void enjoy();
	void eat();
	default void barking() {
		System.out.println("Dog's will bark");
	}
}
class NormalDog implements Dog{
	@Override
	public void enjoy() {
		System.out.println("enjoys nicely by roaming");
	}
	@Override
	public void eat() {
		System.out.println("Eats any type of food");
	}
}
class GoldenRetrieval implements Dog{
	@Override
	public void enjoy() {
		System.out.println("Enjoys nicely with house members");
	}
	@Override
	public void eat() {
		System.out.println("Eats dog food only");
	}
	@Override
	public void barking() {
		System.out.println("Golden Retrieval barks very strongly");
	}
}
class DogFamily{
	void diaplyDetails(Dog ref) {
		ref.eat();
		ref.enjoy();
		ref.barking();
	}
}
public class DefalutMethods {
	public static void main(String[] args) {
		DogFamily df=new DogFamily();
		
		NormalDog nd=new NormalDog();
		GoldenRetrieval gr=new GoldenRetrieval();
		
		df.diaplyDetails(nd);
		df.diaplyDetails(gr);
	}
}
