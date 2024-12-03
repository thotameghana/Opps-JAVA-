package com.megha.encapsulation;

import java.util.Scanner;

class CustomerDemo2{
	private int id;
	private String name;
	private String email;
	private long phNo;
	private String passWd;
	private String address;
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
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

public class Customer2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many Students");
		int n=sc.nextInt();
		CustomerDemo2[] arr=new CustomerDemo2[n];
		for(int i=0;i<n;i++) {
			
			CustomerDemo2 cd=new CustomerDemo2();
			System.out.println(i+1);
			
			int id=sc.nextInt();
			sc.nextLine();
			
			String name = sc.nextLine();
			String email = sc.nextLine();
			long phNo = sc.nextLong();
			sc.nextLine();
			
			String passWd = sc.nextLine();
			String address = sc.nextLine();
			
			cd.setId(id);
			cd.setName(name);
			cd.setEmail(email);
			cd.setPhNo(phNo);
			cd.setPassWd(passWd);
			cd.setAddress(address);
			
			arr[i]=cd;
		}
		for(CustomerDemo2 a:arr) {
			System.out.println(a.getId()+"\n"+a.getName()+"\n"+a.getEmail()+"\n"+a.getPhNo()+"\n"+a.getPassWd()+"\n"+a.getAddress());
		}
		
	}

}
