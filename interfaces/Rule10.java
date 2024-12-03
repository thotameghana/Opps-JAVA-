package com.megha.interfaces;

//by default the variable's in interface are public static final
interface Demo13{
	int a=20;
}

public class Rule10 {
	public static void main(String[] args) {
		System.out.println(Demo13.a);
//		Demo13.a=200;
	}
}
