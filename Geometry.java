package com.opps;

import java.util.Scanner;

abstract class Shape{
	float area;
	abstract void acceptInput();
	abstract void calcArea();
	
	void dispArea() {
		System.out.println("The area is "+area);
	}
	
}
class Square extends Shape{
	private float side;
	@Override
	void acceptInput() {
		System.out.println("Enter the side of square");
		Scanner scan = new Scanner(System.in);
		side=scan.nextFloat();
	}
	@Override
	void calcArea() {
		area=side*side;
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length=scan.nextFloat();
		System.out.println("Enter the breath of rectangle");
		breadth=scan.nextFloat();
	}
	@Override
	void calcArea() {
		area=length*breadth;
	}
}
class Circle extends Shape{
	final float PI=3.142f;
	private float radius;
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius=scan.nextFloat();
	}
	@Override
	void calcArea() {
		area=PI*radius*radius;
	}
}
class Geometry1 {
	void displayAll(Shape shape) {
		shape.acceptInput();
		shape.calcArea();
		shape.dispArea();
	}
}
public class Geometry {
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine();
		
		Geometry1 g = new Geometry1();
		if(s.equals("Square")) {
			Square square = new Square();
			g.displayAll(square);
		}
		else if(s.equals("Rectangle")) {
			Rectangle r = new Rectangle();
			g.displayAll(r);
		}
		else {
			Circle c = new Circle();
			g.displayAll(c);
		}
			
			
	}

}
