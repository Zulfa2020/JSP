package com.nt;

class Abdi1 {
	int x=10;
	int y=20;
	void m1() {
		System.out.println("class Abdi1 m1");
		
	}
	
}//class
public class Non_Static_Members3 extends Abdi1{
	int x=30;
	int y=40;
	void m2() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		System.out.println("x: "+super.x);
		System.out.println("y: "+super.y);
		
	}
	void m3() {
		int x=50;
		int y=60;
		
		System.out.println("local x: "+x);
		System.out.println("local y: "+y);
		
		System.out.println("subclass x: "+this.x);
		System.out.println("subclass y: "+this.y);
		
		System.out.println("superclass x: "+super.x);
		System.out.println("superclass y: "+super.y);
		
	}
	public static void main(String[] args) {
		Non_Static_Members3 ns1=new Non_Static_Members3();
		ns1.m2();
		ns1.m3();
		
		
	}

}
