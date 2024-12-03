package com.megha.Polymorphism;

class Plane1{
	void takeOff() {
		System.out.println("Plane is Taking off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
class CragoPlane extends Plane1{
	@Override
	void fly() {
		System.out.println("Cargo plane flies at lower height's");
	}
	void carryCargo() {
		System.out.println("Cargo plane carries Good's");
	}
}
class PassengerPlane extends Plane1{
	@Override
	void fly() {
		System.out.println("Passenger plane flies at average height's");
	}
	void carryPassengers() {
		System.out.println("Passenger plane carries people");
	}
}
class FighterPlane extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter plane flies at any height's");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carries weapon's");
	}
}

public class Plane {
	public static void main(String[] args) {
		
		Plane1 p = new Plane1();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		
		Plane1 ref;
		
		ref=p;
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println();
		
		ref=pp;
		ref.takeOff();
		ref.fly();
		((PassengerPlane)(ref)).carryPassengers();
		ref.land();
		System.out.println();
		
		ref=fp;		
		ref.takeOff();
		ref.fly();
		((FighterPlane)(ref)).carryWeapons();
		ref.land();
		
		
	}
}

