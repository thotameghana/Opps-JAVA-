package Abstraction;

import java.util.Scanner;

abstract class Shape{
	float volume;
	abstract public void acceptInput();
	abstract public void calcVolume();
	public void dispVolume() {
		System.out.println(volume);
	}
}
class Cube extends Shape{
	float side;
	@Override
	public void acceptInput() {
		Scanner scanner = new Scanner(System.in);
		side=scanner.nextFloat();
	}
	@Override
	public void calcVolume() {
		volume=side*side*side;
	}
}
class Cylinder extends Shape{
	float radius,height;
	@Override
	public void acceptInput() {
		Scanner scanner = new Scanner(System.in);
		radius=scanner.nextFloat();
		height=scanner.nextFloat();
	}
	@Override
	public void calcVolume() {
		volume=(float)Math.PI*height*radius*radius*radius;
	}
}
class Sphere extends Shape{
	float radius;
	@Override
	public void acceptInput() {
		Scanner scanner = new Scanner(System.in);
		radius=scanner.nextFloat();
	}
	@Override
	public void calcVolume() {
		volume=(float)Math.PI*(float)4/3*radius*radius*radius;
	}
}
public class ThreeDShape {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Shape tds;
		if(s.equals("Cube")) {
			tds=new Cube();
		}
		else if(s.equals("Cylinder")) {
			tds=new Cylinder();
		}
		else {
			tds=new Sphere();
			
		}
		tds.acceptInput();
		tds.calcVolume();
		tds.dispVolume();
	}
}
