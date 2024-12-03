package Abstraction;

abstract class Parent{
	static int x;
	static int y;
	static {
		System.out.println("Hello");
		x=100;
		y=200;
	}
	static void display() {
		System.out.println("I'm meghana");
	}
	
	int a, b;
	{
		System.out.println("I'm a instnce block");
	}
	void disp() {
		System.out.println("I'm a full stack developer");
	}
}
class Child extends Parent{
	static {
		System.out.println("Hii");
	}	
	
	
}
public class DataMembersInAbstract {
	
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.x);
		System.out.println(c.y);
		c.display();
		System.out.println(c.a);
		System.out.println(c.b);
		c.disp();
	}
	

}
