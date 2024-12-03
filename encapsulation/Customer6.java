package com.megha.encapsulation;

import java.util.Scanner;

class Restarent{
	private int id;
	private String name;
	private String email;
	private long phno;
	private String passwd;
	private String address;
	
	public Restarent() {
		// TODO Auto-generated constructor stub
	}
	public Restarent(int id,String name,String email,long phno,String address) {
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
	public void setPasswd(String passwd) {
		this.passwd=passwd;
	}
	public String getPasswd() {
		return passwd;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
public class Customer6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restarent r=new Restarent();
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email=sc.nextLine();
		long phno=sc.nextLong();
		sc.nextLine();
		String passwd=sc.nextLine();
		String address=sc.nextLine();
		
		r.setId(id);
		r.setName(name);
		r.setEmail(email);
		r.setPhno(phno);
		r.setPasswd(passwd);
		r.setAddress(address);
		
		System.out.println(r.getId());
		System.out.println(r.getName());
		System.out.println(r.getEmail());
		System.out.println(r.getPhno());
		System.out.println(r.getPasswd());
		System.out.println(r.getAddress());
		
		
		
	}

}
