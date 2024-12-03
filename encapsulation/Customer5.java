package com.megha.encapsulation;

import java.util.Scanner;

class CustomerDemo5{
	private int id;
	private String name;
	private String email;
	private long phno;
	private String passwd;
	private String address;
	
	public CustomerDemo5() {
		
	}
	
	public CustomerDemo5(int id,String name,String email,long phno,String passwd,String address) {
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
public class Customer5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email = sc.nextLine();
		long phno = sc.nextLong();
		sc.nextLine();
		String passwd = sc.nextLine();
		String address=sc.nextLine();
		if(phno>=5999999999L) {
			CustomerDemo5 cd=new CustomerDemo5(id,name,email,phno,passwd,address);
			
			System.out.println(cd.getId());
			System.out.println(cd.getName());
			System.out.println(cd.getEmail());
			System.out.println(cd.getPhno());
			System.out.println(cd.getPasswd());
			System.out.println(cd.getAddress());
		}
		else {
			System.out.println("Enter correct mobile number....");
		}
		
	}

}
