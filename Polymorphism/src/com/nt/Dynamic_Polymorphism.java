package com.nt;

class A1{
	static int a=10;
	int x=20;
	static void m1() {
		System.out.println("A M1");
	}
	void m2() {
		System.out.println("A M2");
	}
	void m3(){
	     System.out.println("A M3");
	     System.out.println("A a:"+a);
	     System.out.println("A x:"+x);
	     m1();
	     m2();
	     
	}
}
class B1 extends A1{
	static int a=40;
	int x=50;
	static void m1() {
		System.out.println("B M1");
	}
	void m2() {
		System.out.println("B M2");
		 System.out.println("B a:"+a);
	     System.out.println("B x:"+x);
	     
	}
	void m4() {
		super.a=a-10;
		super.x=x-10;
	}
}
public class Dynamic_Polymorphism {

	public static void main(String[] args) {
		B1 b=new B1();
		B1 b1=new B1();
		A1 a1=new B1();
	
	b.a=15;
	b.x=16;
	b1.a=17;
	b1.x=18;
	
	b.m4();
	b1.m4();
	
	b.m3();
	System.out.println();
	b1.m3();
	System.out.println();
	
	System.out.println(b.a);
	System.out.println(a1.a);
	
	System.out.println(b.x);
	System.out.println(a1.x);
	
	
	
	
	}

}
