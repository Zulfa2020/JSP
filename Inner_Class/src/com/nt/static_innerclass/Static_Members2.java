package com.nt.static_innerclass;

 class A {
static int a=10;
int x=20;
static class B{
	static int a=50;
	int x=60;
	void m1() {
		System.out.println(a);
		System.out.println(x);
		
		A s=new A ();
		System.out.println(A .a);
		System.out.println(s.x);
		
	}//m1
}////class
void m2() {
	System.out.println(a);
	System.out.println(x);
	B b=new B();
	System.out.println(B.a);
	System.out.println(b.x);
	
	
}//m2
	public static void main(String[] args) {
		A s=new A();
		s.m2();
		B b=new B();
		b.m1();
	}

}//class
public class Static_Members2 {
	public static void main(String[] args) {
		A s1=new A();
		A.B b1=new A.B();
		System.out.println(A.a);
		System.out.println(A.B.a);
		
		System.out.println(b1.x);
		System.out.println(b1.x);
	
	}
}
