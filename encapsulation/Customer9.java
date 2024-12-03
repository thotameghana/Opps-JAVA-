package com.megha.encapsulation;

import java.util.Scanner;

class Restarent4{
	private int id;
	private String name;
	private String email;
	private long phno;
	private String address;
	
	public Restarent4() {
		
	}
	public Restarent4(int id,String name,String email,long phno,String address) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phno=phno;
		this.address=address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
public class Customer9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email=sc.nextLine();
		long phno=sc.nextLong();
		sc.nextLine();
		String address=sc.nextLine();
		
		if(email.endsWith(name+".com")) {
			Restarent4 r=new Restarent4(id,name,email,phno,address);
			
			System.out.println(r.getId());
			System.out.println(r.getName());
			System.out.println(r.getEmail());
			System.out.println(r.getPhno());
			System.out.println(r.getAddress());	
		}
		else {
			System.out.println("Domain name must be same as the restarent name");
		}
	}
}
