package com.opps;
class Customer{
	String name;
	String email;
	long phNo;
	String address;
	
	void selectRestarent() {
		System.out.println("The restarent has selected");
	}
	void selectItem() {
		System.out.println("The Item has selected");
	}
	void selectAddress() {
		System.out.println("select your address");
	}
	void cancelOrder() {
		System.out.println("Click here to calcel address");
	}
	void makePayment() {
		System.out.println("Scan here and make paymet");
	}
	void availDiscount() {
		System.out.println("Click here to avail discount");
	}
	void provideLiveLocation() {
		System.out.println("Provide you live location");
	}
}
class StaffMember extends Customer{
	void availSpecialDiscount(){
		System.out.println("Special discount for staff member's");
	}
}
class PlatinumCustomer{
	int platinumId;
	int credits;
	void freeDelivery() {
		System.out.println("Free delivery");
	}
	void exclusiveOffers() {
		System.out.println("This is the exclussive offer");
	}
}
class DeliveryAgent{
	String name;
	float ratings;
	long PhNo;
	void confirmPickUp() {
		System.out.println("conformed pickUp");
	}
	void contactCustomer() {
		System.out.println("If you have any quaries contact customer");
	}
}
class FoodItem{
	String name;
	float price;
	float ratings;
	int votes;
}
public class Launch {
	public static void main(String[] args) {
		
	}

}
