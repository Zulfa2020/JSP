package com.nt;
/*
class A1{
	static void m1() {
		System.out.println("A M1");
	}
	 void m2() {
		System.out.println("A M2");
	}
	static void m3() {
		System.out.println("A M3");
		}
    int m3(String s) {
			System.out.println("A M3-with-param");
			return 50;
		}
}
class B1 extends A1{
	static void m1() {
		System.out.println("B M1");
	}
	 void m2() {
		System.out.println("B M2");
	}
	 void m3(float f,int x) {
		System.out.println("B M3-with-param");
		}
}
public class poly1 {

	public static void main(String[] args) {
	B1 b=new B1();
	b.m1();
	b.m2();
	b.m3();
	b.m3("abc");
	b.m3(45.3f,45);
	
	A1 a=new B1();
	a.m1();
	a.m2();
	a.m3();
	a.m3("abc");
	//a.m3(45.3f,45);
	}

}
*/
/*
//Method execution flow
class A1{
	  void m1() {
		System.out.println("A M1");
	}
	 void m2() {
		System.out.println("A M2");
		m1();
	}
}
class poly1 extends A1{
	  void m1() {
		System.out.println("Poly1 M1");
	}
	public static void main(String[] args) {
		poly1 b=new poly1();
		b.m1();
		b.m2();
		
		A1 a=new poly1();
		a.m1();
		a.m2();
	}
}
*/
/*
// Executing overridden method from superclass using SUPER.
class A10{
	
	void m1() {
		System.out.println("A M1");
	}
	
	 void m2() {
		System.out.println("A M2");
	}
	 
	  void m3(){
		System.out.println("A M3");
		}
}
class Overriding_Method  extends A10{
	void m1() {
		System.out.println("B M1");
	}
	 void m2() {
		 super.m2();
	 System.out.println("B M2");
	}
	public static void main(String[] args) {
		Overriding_Method b=new  Overriding_Method();
	b.m1();
	b.m2();
	b.m3();
	}
}
*/

/*
 // Executing superclass static method and Main method from subclass using CLASSNAME ONLY
class A{
	static void m1() {
		System.out.println("A M1");
	}
	public static void main(String[] args) {
	System.out.println("A main");
	}
}
class poly1 extends A{
	static void m1() {
		A.m1();
		System.out.println("B M1");
	}
	public static void main(String[] args) {
		A.main(args);
		System.out.println("B main");
		poly1 b=new poly1();
		b.m1();
	
}
}
*/