package com.megha.interfaces;

//methods inside an interface is automatically public and abstract
interface Demo3{
	void add();
	void sub();
	void mul();
}
class Calculator4 implements Demo3{
	@Override
	public void add() {//if we remove public, can't reduce the visibility
		
	}
	@Override
	public void sub() {
		
	}
	@Override
	public void mul() {
		
	}
}
public class Rule3 {
	public static void main(String[] args) {
		
	}
}
