package com.nt;
/*
 // non-static methods polymorphism
class A15{
	void m1() {
		System.out.println("A M1");
	}
	void m2() {
		System.out.println("A M2");
	}
}
class B15 extends A15{
	void m1() {
		System.out.println("B M1");
	}
	void m3() {
		System.out.println("B M3");
		m1();
		super.m2();
	}
}
class C15 extends B15{
	
	void m2() {
		System.out.println("C M2");
		
	}
}
class Hiding_and_Overriding extends C15{
	void m1() {
		System.out.println("D M1");
	}
	void m2() {
		System.out.println("D M2");
		
	}
	void m4() {
		System.out.println("D M4");
		
	}

public static void main(String[] args) {
	Hiding_and_Overriding p=new Hiding_and_Overriding();
	p.m1();
	p.m2();
	p.m3();
	p.m4();
}
}
*/
/*
 // static methods and non-static methods polymorphism
class A16{
	static void m1() {
		System.out.println("A M1");
	}
	static void m2() {
		System.out.println("A M2");
		m1();
	}
}
class B16 extends A16{
	static void m1() {
		System.out.println("B M1");
	}
	void m3() {
		System.out.println("B M3");
		m1();
		super.m2();
	}
}
class C16 extends B16{
	
	static void m2() {
		System.out.println("C M2");
		
	}
}
class Hiding_and_Overriding extends C16{
	static void m1() {
		System.out.println("D M1");
	}
	static void m2() {
		System.out.println("D M2");
		
	}
	static void m4() {
		System.out.println("D M4");
		
	}

public static void main(String[] args) {
	Hiding_and_Overriding p=new Hiding_and_Overriding();
	p.m1();
	p.m2();
	p.m3();
	p.m4();
}
}
*/

