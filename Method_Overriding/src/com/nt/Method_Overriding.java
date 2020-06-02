package com.nt;

public class Method_Overriding {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		B1 b=new B1();
		b.m1();
		b.m2();
		b.m3();
		b.m3("abc");
		//b.m3(54.6,56);
		b.m3(54.5f,56);
		
		
		A1 a=new B1();
	     a.m1();
	     a.m2();
	     a.m3();
	     a.m3("abc");
	     //a.m3(45.5f,56);
	}

}
