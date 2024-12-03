package com.megha.encapsulation;

//class HumanBeing
//{
//	  private String heart;
//	  private String brain;
//	  public void setData(String h,String b)
//	  {
//		  heart=h; brain=b; 
//	  }
//	  public String getData()
//	  { 
//		  return heart+" "+brain;
//	  }
//}	
class Bank
{
	private int accNo;
	private int passwd;
	private String name;
	public void setAccNo(int a)
	{
		accNo=a;
	}
	public void setPassWd(int y)
	{
		passwd=y;
	}
	public void setName(String z)
	{
		name=z;
	}
	public int getAccNo()
	{
		return accNo;
	}
	
	public int getPassWd()
	{
		return passwd;
	}
	public String getName()
	{
		return name;
	}
	
	
}
public class EncapsulationDemo {
	
	public static void main(String[] args) {
//		HumanBeing hb=new HumanBeing();
//		hb.setData("yes", "no");
//		System.out.println(hb.getData());
		Bank b=new Bank();
		b.setAccNo(123);
		b.setPassWd(9898);
		b.setName("Meghana");
		System.out.println(b.getAccNo());
		System.out.println(b.getPassWd());
		System.out.println(b.getName());	
	}
}
