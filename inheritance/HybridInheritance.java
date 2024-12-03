package Inheritance;

class GrandParent2 extends Object{
	float height=5.9f;
	String color="Brown";
	void readBooks() {
		System.out.println("I will read books");
	}
	void readNewsPaper() {
		System.out.println("I will read news paper");
	}
}
class Parent3 extends GrandParent2{
	
}
class Child5 extends Parent3{
	
}
class Child6 extends Parent3{
	
}
public class HybridInheritance {
	public static void main(String[] args) {
		Child6 c5=new Child6();
		System.out.println(c5.height);
		System.out.println(c5.color);
		c5.readBooks();
		c5.readNewsPaper();
	}

}
