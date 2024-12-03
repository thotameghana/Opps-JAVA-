package Inheritance;
class ParentClass{
	int x,y;
	public ParentClass() {
		System.out.println("Partent class zero parameterized Constructor");
		x=100;
		y=200;
	}
	public ParentClass(int x,int y) {
		System.out.println("Parent class parameterized constructor");
		this.x=x;
		this.y=y;
	}
}
class ChildClass extends ParentClass{
	int a,b;
	public ChildClass() {
		System.out.println("Child class Zero parameterized constructor");
		a=10;
		b=20;
	}
	public ChildClass(int a,int b) {
		super(a,b);
		System.out.println("Child class Parameterized constructor");
		this.a=a;
		this.b=b;
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		ChildClass c=new ChildClass(10,20);
		
		
	}
}
