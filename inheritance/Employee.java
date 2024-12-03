package Inheritance;

class Employee1{
	static void display() {
		System.out.println("Hii");
	}
}
class Employee2 extends Employee1{
	
	static void display(int a) {
		System.out.println("Helloo");
	}
	@Override
	public String toString(){
		return "Heyy";
	}
}
public class Employee{
	
	public static void main(String[] args) {
		
		Employee2 e= new Employee2();
		System.out.println(e);
		
	}
	
}
