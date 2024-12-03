package com.megha.encapsulation;

import java.util.Scanner;

class CustomerDemo{
	private int id;
	private String name;
	private String email;
	private long phNo;
	private String passWd;
	private String address;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEMail() {
		return email;
	}
	
	public void setPhNo(long phNo) {
		this.phNo=phNo;
	}
	public long getPhNo() {
		return phNo;
	}
	
	public void setPassWord(String passWd) {
		this.passWd=passWd;
	}
	public String getPassWord() {
		return passWd;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}
public class Customer {
	public static void main(String[] args) {
		CustomerDemo cd = new CustomerDemo();
		Scanner sc = new Scanner(System.in);
		
		int id=sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		
		String email = sc.nextLine();
		
		long phNo = sc.nextLong();
		sc.nextLine();
		String passWd = sc.nextLine();
		String address = sc.nextLine();
		
		//setter
		cd.setId(id);
		cd.setName(name);
		cd.setEmail(email);
		cd.setPhNo(phNo);
		cd.setPassWord(passWd);
		cd.setAddress(address);
		//getters
		System.out.println(cd.getId());
		System.out.println(cd.getName());
		System.out.println(cd.getEMail());
		System.out.println(cd.getPhNo());
		System.out.println(cd.getPassWord());
		System.out.println(cd.getAddress());	
	}
}
