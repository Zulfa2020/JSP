package com.nt.static_innerclass;

class X{
	static int a=10;
	int y=20;
	
	static class Y{
		static int a=50;
		int y=60;
		void m1() {
			System.out.println(a);
			System.out.println(y);
			X x=new X();
			System.out.println(X.a);
			System.out.println(x.y);
			
		}//m1
	}//inner class
	

public static void main(String[] args) {
	X x=new X();
	x.m2();
	Y z=new Y();
	z.m1();
	
	
}//main
void m2() {
	System.out.println(a);
	System.out.println(y);
	Y z=new Y();
	System.out.println(Y.a);
	System.out.println(z.y);
	
}//m2
}//outer class
class Static_Innerclass{
	public static void main(String[] args) {
		X x1=new X();
		X.Y z1=new X.Y();
		System.out.println(X.a);
		System.out.println(X.Y.a);
		
		System.out.println(x1.y);
		System.out.println(z1.y);
		
		
	}
	
}//class

