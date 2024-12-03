package com.megha.encapsulation;

import java.util.Scanner;

class Restarent2{
	private int id;
	private String name;
	private String email;
	private long phno;
	private String passwd;
	private String address;
	
	public Restarent2() {

	}
	public Restarent2(int id,String name,String email,long phno,String passwd,String address) {
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
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
public class Customer7 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Restarent2[] data=new Restarent2[n];
		
		for(int i=0;i<n;i++) {
			Restarent2 r=new Restarent2();
			System.out.println(i+1);
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
			
			data[i]=r;
		}
		
		for(Restarent2 d:data) {
			System.out.println(d.getId()+"\n"+d.getName()+"\n"+d.getEmail()+"\n"+d.getPhno()+"\n"+d.getAddress());
		}
		
	}
}
