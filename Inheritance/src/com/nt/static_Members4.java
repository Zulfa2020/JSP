package com.nt;
class A0{
	static int a=10;
	static {
		System.out.println("class A SB.");
		}
	static void m1() {
		System.out.println("static method M1.");
	}
}//class
class B0 extends A0{
	static int b=20;
	static {
		System.out.println("class B SB.");
		}
}
public class static_Members4 {
public static void main(String[] args) {
	System.out.println(B0.class);
	System.out.println(B0.a);
	System.out.println(B0.b);
}//main
}//class
