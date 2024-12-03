package com.megha.encapsulation;

import java.util.Scanner;

class Restarent3{
	private int id;
	private String name;
	private String email;
	private long phno;
	private String address;
	public Restarent3(){
		
	}
	public Restarent3(int id,String name,String email,long phno,String address) {
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
public class Customer8 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		String[] arr=data.split(",");
		
		int id=Integer.parseInt(arr[0]);
		String name=arr[1];
		String email=arr[2];
		long phno=Long.parseLong(arr[3]);
		String address=arr[4];
		
		Restarent3 r=new Restarent3(id,name,email,phno,address);
		System.out.println(r.getId());
		System.out.println(r.getName());
		System.out.println(r.getEmail());
		System.out.println(r.getPhno());
		System.out.println(r.getAddress());
		
		
	}
}
