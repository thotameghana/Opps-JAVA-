package com.megha.encapsulation;

import java.util.Scanner;

class Menu3{
	private int id;
	private String name;
	private int price;
	private String description;
	
	public Menu3() {
		
	}
	public Menu3(int id,String name,int price,String description) {
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
public class Customer13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(",");
		int id=Integer.parseInt(arr[0]);
		String name=arr[1];
		int price=Integer.parseInt(arr[2]);
		String description=arr[3];
		
		Menu3 m=new Menu3(id,name,price,description);
		
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.getDescription());
		
		
	}
}
