package Abstraction;

abstract class Demo4{
	public Demo4(){
		System.out.println("Hello");
	}
}
class Demo5 extends Demo4 {
	public Demo5() {
		System.out.println("Good morning");
	}
}
public class ConstructorInAbstarctClass {
	public static void main(String[] args) {
		Demo5 d=new Demo5();
	}

}
