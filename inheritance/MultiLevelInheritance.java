package Inheritance;

class GrandParent{
	float height=5.9f;
	String color="Brown";
	void readBooks() {
		System.out.println("I will read books");
	}
	void noDrink() {
		System.out.println("I will not drink");
	}
	void noSmoke() {
		System.out.println("I will not smoke");
	}
}
class Parent1 extends GrandParent{
	
}
class Child1 extends Parent1{
	
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.height);
		System.out.println(c.color);
		c.noDrink();
		c.noSmoke();
		
	}

}
