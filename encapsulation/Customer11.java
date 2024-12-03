package com.megha.encapsulation;

import java.util.Scanner;

class Menu{
	private int id;
	private String name;
	private int price;
	private String description;
	
	public Menu(){
		
	}
	public Menu(int id,String name,int price,String description) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.description=description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
public class Customer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int price=sc.nextInt();
		sc.nextLine();
		String description=sc.nextLine();
		
		Menu m=new Menu();
		m.setId(id);
		m.setName(name);
		m.setPrice(price);
		m.setDescription(description);
		
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.getDescription());
		
	}
}
