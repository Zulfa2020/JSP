package com.nt;
class A2{
	static int a=10;
	static {
		System.out.println("class A SB.");
		System.out.println(a);
		System.out.println(B2.b);
		}
	static void m1() {
		System.out.println(" class A2 static method M1.");
	}
	
}//class
class B2 extends A2{
	static int b=20;
	static {
		System.out.println("class B2 SB.");
		System.out.println(a);
		System.out.println(b);
		
		}
}

public class static_Members5 {

	public static void main(String[] args) {
		//System.out.println(B2.a);
		//System.out.println(B2.b);
		B2.m1();
	}

}
