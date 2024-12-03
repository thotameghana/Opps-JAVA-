package com.megha.encapsulation;

import java.util.Scanner;

class Menu2{
	private int id;
	private String name;
	private int price;
	private String description;
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
public class Customer12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Menu2[] arr=new Menu2[n];
		for(int i=0;i<n;i++) {
			
			Menu2 m=new Menu2();
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int price=sc.nextInt();
			sc.nextLine();
			String description=sc.nextLine();

			m.setId(id);
			m.setName(name);
			m.setPrice(price);
			m.setDescription(description);
			arr[i]=m;
		}
		for(Menu2 d:arr) {
			System.out.println(d.getId()+"\n"+d.getName()+"\n"+d.getPrice()+"\n"+d.getDescription());
		}
	}
}
