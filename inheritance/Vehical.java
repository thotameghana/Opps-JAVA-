package Inheritance;

class Vehical1{
	private int wheels;
	private String colour;
	private double price;
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Hello world");
	}
}
class Car extends Vehical1{
	
}
class Bike extends Vehical1{
	
}
public class Vehical {
	public static void main(String[] args) {
		int wheels=4;
		String colour="black";
		double price=400000.0;
		
		Vehical1 v1 = new Vehical1();
		Car c = new Car();
		Bike b = new Bike();
		
		v1.setWheels(wheels);
		v1.setPrice(price);
		v1.setColour(colour);
		
		System.out.println(c.getWheels());
		System.out.println(c.getColour());
		System.out.println(c.getPrice());
		
		System.out.println(b.getWheels());
		System.out.println(b.getColour());
		System.out.println(b.getPrice());
		b.display();
		c.display();
	}
}
