package com.megha.interfaces;

//JDK-9 or java-9
//TO remove redundancy
//not exposing the private methods to other classes
interface PrivateMethod{
	private void professionalLife() {
		System.out.println("professional life of human");
		System.out.println("Doing Tasks");
		System.out.println("Interacting other's");
	}
	private void personalLife() {
		System.out.println("Persional life of human");
		System.out.println("Eating");
		System.out.println("Sleeping");
		System.out.println("Spending time with family");
	}
	default void humanBeing() {
		professionalLife();
		personalLife();
	}
}
class Human implements PrivateMethod{
	
}
public class PrivateMethods {
	public static void main(String[] args) {
		Human h = new Human();
		h.humanBeing();
	}
}
