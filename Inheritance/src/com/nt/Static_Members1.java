package com.nt;

class Super_Example{
	static int a=10;
	static {
		System.out.println("class Super_Example SB");
		System.out.println("a: "+Super_Example.a);
		System.out.println("b: "+Super_Example.b);
		System.out.println("c: "+Static_Members1.c);
		
	}
	
	public static void main(String[] args) {
		System.out.println("class Super_Example MM");
		System.out.println("a: "+Super_Example.a);
		System.out.println("b: "+Super_Example.b);
		
		System.out.println("c: "+Static_Members1.c);
	}
	static int b=20;

}


public class Static_Members1 extends Super_Example{
	static int c=30;
	static {
		System.out.println("class Static_Members3 SB");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		
	}
	public static void main(String[] args) {
		System.out.println("class Static_Members3 MM");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}


}
