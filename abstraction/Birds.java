package Abstraction;

abstract class Bird{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird{
	@Override
	void fly() {
		System.out.println("Eagle can flies at greater height's");
	}
}
class SerpentEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("SerpentEagle eat's snakes");
	}
}
class GoldenEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("Golden eagle eat's fishe's");
	}
}
class BirdFamily{
	void display(Bird b) {
		b.fly();
		b.eat();
	}
}
public class Birds {
	public static void main(String[] args) {
		//no code flexibility
//		SerpentEagle se=new SerpentEagle();
//		se.fly();
//		se.eat();
//		
//		GoldenEagle ge=new GoldenEagle();
//		ge.fly();
//		ge.eat();
		
		SerpentEagle se=new SerpentEagle();
		GoldenEagle ge=new GoldenEagle();
		BirdFamily bf=new BirdFamily();
		bf.display(se);
		bf.display(ge);
	}
}
