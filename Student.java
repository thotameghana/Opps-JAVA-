package arrays;

import java.util.Scanner;

class StudentData{
	private int id;
	private String name;
	private float height;
	private String address;
	
	public StudentData(){
		
	}
	public StudentData(int id,String name,float height,String address) {
		this.id=id;
		this.name=name;
		this.height=height;
		this.address=address;
	}
	
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
	public void setHeight(float height) {
		this.height=height;
	}
	public float getHeight() {
		return height;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}
public class Student {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=scan.nextInt();
		scan.nextLine();
		StudentData[] data=new StudentData[n];
		for(int i=0;i<n;i++) {
			
			StudentData sd=new StudentData();
			System.out.println("Enter the details of Student "+(i+1));
			String details=scan.nextLine();
			String[] arr=details.split(",");
			
			int id=Integer.parseInt(arr[0]);
			float height=Float.parseFloat(arr[2]);
			
			sd.setId(id);
			sd.setName(arr[1]);
			sd.setHeight(height);
			sd.setAddress(arr[3]);
			
			data[i]=sd;
		}
		for(StudentData a:data) {
			System.out.println(a.getId()+" "+a.getName()+" "+a.getHeight()+" "+a.getAddress());
		}
		System.out.println();
	}
}
