package Inheritance;

class Animal1{
	void eat() {
		System.out.println("Animal's will eat");
	}
	void sleep() {
		System.out.println("Animal's will sleep");
	}
}
class Deer extends Animal1{
	@Override
	void eat() {
		System.out.println("Deer is a herbivores");
	}
	@Override
	void sleep() {
		System.out.println("Deer will sleep fully");
	}
}
class Tiger extends Animal1{
	@Override
	void eat() {
		System.out.println("Tiger is Carnivores");
	}
	@Override
	void sleep() {
		System.out.println("Tiger will sleep less time");
	}
}
class Monkey extends Animal1{
	@Override
	void eat() {
		System.out.println("Monkey is Omnivores");
	}
	@Override
	void sleep() {
		System.out.println("Monkey will sleep at night times");
	}
}
public class Animal {
	public static void main(String[] args) {
		Deer d = new Deer();
		d.eat();
		d.sleep();
		
		System.out.println();
		
		Tiger t = new Tiger();
		t.eat();
		t.sleep();
		
		System.out.println();
		
		Monkey m=new Monkey();
		m.eat();
		m.sleep();

	}
}
