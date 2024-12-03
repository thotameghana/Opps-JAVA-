package Inheritance;

class Parent{
	float height=5.9f;
	String color="brown";
	void readBooks() {
		System.out.println("I will read books");
	}
	void noSmoke() {
		System.out.println("I will not smoke");
	}
	void noDrink() {
		System.out.println("I will not drink");
	}
}
class Child extends Parent{
	
}
public class SingleInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.height);
		System.out.println(c.color);
		c.noSmoke();
		c.noDrink();
	}
}
