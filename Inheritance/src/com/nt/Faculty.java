package com.nt;

public class Faculty extends Person {
	private int Fno;
	private double sal;
	public int getFno() {
		return Fno;
	}
	public void setFno(int fno) {
		Fno = fno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void teach() {
		System.out.println(" Teaching");
	}
	public void conductingExam() {
		System.out.println(" conductingExam");
	}

	void display() {
		System.out.println("Person Properties****************** ");
		System.out.println("Eyes: "+getEye());
		System.out.println("Ears: "+getEars());
		System.out.println("Hands: "+getHands());
		System.out.println("Legs: "+getLegs());
		//System.out.println(getName());
		System.out.println("MobileNo: "+getMobilNo());
		
		System.out.println("Faculty Properties **************************");
		System.out.println("Eyes: "+getEye());
		System.out.println("Ears: "+getEars());
		System.out.println("Hands: "+getHands());
		System.out.println("Legs: "+getLegs());
		//System.out.println(getName());
		System.out.println("MobileNo: "+getMobilNo());
		
		System.out.println("Fno: "+Fno);
		System.out.println("Salary: "+sal);
		
		
	}
	
	
}
