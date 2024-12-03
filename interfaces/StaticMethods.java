package com.megha.interfaces;
//Java-8 or JDK-8
//static methods are used in interface to access the content without creating another class and object
//Static methods can't be inherited and overridden 
interface StaticMethod{
	static void display() {
		System.out.println("Hello wolrd");
	}
}
public class StaticMethods {
	public static void main(String[] args) {
		StaticMethod.display();
	}
}
