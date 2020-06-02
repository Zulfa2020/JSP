package com.nt;

class Abdi {
	static int a=10;
	
	int x=20;
	static void m1() {
		System.out.println("class Abdi m1");
		
	}
	void m2() {
		System.out.println("class Abdi m2");
		
	}
	void m3() {
		System.out.println("class Abdi m3");
		
	}
	
}//class

public class Non_Static_Members2 extends Abdi{
	
static int a=60;
	
	int x=50;
	static void m1() {
		//super.m1();//C.E,non-static variable super cannot be referenced from static context. 
		System.out.println("class Non_Static_Members2 m1");
		
	}
	void m2() {
		System.out.println("class Non_Static_Members2 m2");
		super.m2();
	}
	void m4() {
		System.out.println(super.a+"...."+a);
		System.out.println(super.x+"...."+x);
		super.m1();
		m1();
		super.m2();
		m2();
		
		
	
	}
public static void main(String[] args) {
	System.out.println("a: "+a);
	m1();
	
	Non_Static_Members2 ns=new Non_Static_Members2();
          ns.m4();
           
  }
}
