package com.nt;

public class Person {
	private  int eye;
	private  int ears;
	private  int legs;
	private  int hands;
    String name;
	private  long mobilNo;

	public int getEye() {
		return eye;
	}
	public void setEye(int eye) {
		this.eye = eye;
	}
	public int getEars() {
		return ears;
	}
	public void setEars(int ears) {
		this.ears = ears;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getHands() {
		return hands;
	}
	public void setHands(int hands) {
		this.hands = hands;
	}
	
	 public String getName() {
	
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	public long getMobilNo() {
		return mobilNo;
	}
	public void setMobilNo(long mobilNo) {
		this.mobilNo = mobilNo;
	}
	public void eat() {
	System.out.println(name+" Is Eating");
		
	}
public void sleep() {
	System.out.println(name+" Is Sleeping");
	
}
public void learn() {
	System.out.println(name+" Is Learning");
	
}

	
}
