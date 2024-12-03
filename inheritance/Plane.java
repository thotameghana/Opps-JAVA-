package Inheritance;

class Plane1{
	Plane1(){
		System.out.println("MEghana");
	}
	void takeOff() {
		System.out.println("I will take off");
	}
	void fly() {
		System.out.println("I am flying");
	}
	void land() {
		System.out.println("I will land");
	}
}
class CargoPlane extends Plane1{
	void fly() {
		System.out.println("Cargo plane flies at lower heights");
	}
	void carrayCargo() {
		System.out.println("Cargo plane carry goods");
	}
}
class PassengerPlane extends Plane1{
	
}
class FighterPlane extends Plane1{
	
}
public class Plane {
	public static void main(String[] args) {
		FighterPlane fp=new FighterPlane();
		
	}

}
