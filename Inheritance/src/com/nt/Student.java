package com.nt;
class Student extends Person{
	private int sno;
	private double fee;
	String course;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}

	
	public void listen() {
		System.out.println(name+" is Listening"+course);
	}
	
	public void read() {
		System.out.println(name+" is reading "+course);
	}
	
	public void writeExam() {
		System.out.println(name+" is writing exam "+course);
	}
	
	void display() {
		System.out.println("Person Properties****************** ");
		System.out.println("Eyes: "+getEye());
		System.out.println("Ears: "+getEars());
		System.out.println("Hands: "+getHands());
		System.out.println("Legs: "+getLegs());
		//System.out.println(getName());
		System.out.println("MobileNo: "+getMobilNo());
		
		System.out.println("Student Properties **************************");
		System.out.println("Eyes: "+getEye());
		System.out.println("Ears: "+getEars());
		System.out.println("Hands: "+getHands());
		System.out.println("Legs: "+getLegs());
		//System.out.println(getName());
		System.out.println("MobileNo: "+getMobilNo());
		
		System.out.println("Sno: "+sno);
		System.out.println("Fee: "+fee);
		
		
	}
	
	

   }//Student class
