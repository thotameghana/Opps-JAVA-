package Inheritance;

import java.util.Scanner;

class Employee43{
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getAnnualSalary() {
		return salary*12;
	}
	
}
class Manager extends Employee43{
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public double getAnnualSalary() {
		return super.getAnnualSalary()+bonus;
	}
}
class Engineer extends Employee43{
	private double overTime;

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}

	@Override
	public double getAnnualSalary() {
		return (super.getAnnualSalary()+overTime);
	}
}

public class Company {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String type=sc.nextLine();
		
		String data=sc.nextLine();
		String[] d=data.split(",");
		
		String name=d[0];
		double salary=Double.parseDouble(d[1]);
		
		Employee43 employee=new Employee43();
		Engineer engineer=new Engineer();
		Manager manager=new Manager();
		
		employee.setName(name);
		employee.setSalary(salary);
		
		manager.setName(name);
		manager.setSalary(salary);
		
		engineer.setName(name);
		engineer.setSalary(salary);
		
			if(type.equals("Manager")) 
			{
				double bonus=Double.parseDouble(d[2]);
				manager.setBonus(bonus);
				System.out.println("Annual salary of the Manager "+manager.getAnnualSalary());
			}
			else 
			{
				double overTime=Double.parseDouble(d[2]);
				engineer.setOverTime(overTime);
				
				System.out.println("Annual salary of the Engineer "+engineer.getAnnualSalary());
			}
	}
}
