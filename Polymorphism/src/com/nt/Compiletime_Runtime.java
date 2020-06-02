package com.nt;
class A2{
	static void m1() {
		System.out.println("A M1");
	}
	 void m2() {
		System.out.println("A M2");
	}
	 void m3() {
		System.out.println("A M3");
		}
	 void m4() {
			System.out.println("A M4------");
			}
}
public class Compiletime_Runtime extends A2{
	static void m1() {
		System.out.println("CR M1");
	}
	 void m2() {
		System.out.println("CR M2");
	}
	
	 void m4(String s) {
			System.out.println("CR M4-with param");
			}
	public static void main(String[] args) {
		Compiletime_Runtime c=new Compiletime_Runtime();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m4("HK");
		A2 a=new Compiletime_Runtime();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		//a.m4("HK");
		
	
	}

}
