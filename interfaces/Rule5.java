package com.megha.interfaces;

//a class partially implementing an interface that must be declared as abstract class
interface Demo4{
	void add();
	void sub();
}
abstract class Arthemetic implements Demo4{
	@Override
	public void add() {
		System.out.println("Adding");
	}
}
public class Rule5 {
	public static void main(String[] args) {
		
	}
}
