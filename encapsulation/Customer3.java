package com.megha.encapsulation;

import java.util.Scanner;

class CustomerDemo3{
	private int id;
	private String name;
	private String email;
	private long phno;
	private String passwd;
	private String address;
	
	CustomerDemo3(int id,String name,String email,long phno,String passwd,String address){
		this.id=id;
		this.name=name;
		this.email=email;
		this.phno=phno;
		this.passwd=passwd;
		this.address=address;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhno() {
		return phno;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getAddress() {
		return address;
	}
}
public class Customer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data=sc.nextLine();
		String[] details=data.split(",");
		
		int id=Integer.parseInt(details[0]);
		String name=details[1];
		String email=details[2];
		long phno=Long.parseLong(details[3]);
		String passwd=details[4];
		String address=details[5];
		
		CustomerDemo3 cd=new CustomerDemo3(id, name, email, phno, passwd, address);
		
		System.out.println(cd.getId());
		System.out.println(cd.getName());
		System.out.println(cd.getEmail());
		System.out.println(cd.getPhno());
		System.out.println(cd.getPasswd());
		System.out.println(cd.getAddress());
	}
}
