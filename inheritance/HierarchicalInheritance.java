package Inheritance;

class Parent2{
	float height=5.9f;
	String color="Brown";
	void readBooks(){
		System.out.println("I will read books");
	}
	void readNewsPaper(){
		System.out.println("I will read newspaper daily");
	}
}
class Child2 extends Parent2{
	
}
class Child3 extends Parent2{
	
}
class Child4 extends Parent2{
	
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Child3 c=new Child3();
		System.out.println(c.height);
		System.out.println(c.color);
		c.readBooks();
		c.readNewsPaper();
	}
}
