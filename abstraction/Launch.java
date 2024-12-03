package Abstraction;

 abstract class Demo{
	 abstract void display();
}
 class Demo2 extends Demo{
	void display() {
		System.out.println("Hii");
	}
}
class Demo3 extends Demo2{

	
}

class Launch {
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.display();
	}
}
