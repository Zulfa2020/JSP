package com.nt;

class EX{

	int y=10;

	

	class Bn{
		int y=70;

		void m1() {
			System.out.println("accessing outer class variable in non-static inner class: "+y);//local class variable
			System.out.println("accessing outer class variable in non-static inner class: "+this.y);//current object class variable
			System.out.println("accessing outer class variable in non-static inner class: "+EX.this.y);//outer class variable
			System.out.println();
		}
		void m3() {
			int y=50;
			System.out.println("accessing outer class variable in non-static inner class: "+y);//local class variable
			System.out.println("accessing outer class variable in non-static inner class: "+this.y);//current object class variable
			System.out.println("accessing outer class variable in non-static inner class: "+EX.this.y);//outer class variable
			System.out.println();
		}
	}//inner class

void m2() {

	System.out.println("non-static:"+y);
	System.out.println();
	Bn b=new Bn();
	System.out.println(b.y);
}
public static void main(String[] args) {
	EX e=new EX();
	e.m2();
	EX.Bn b=e.new Bn();
	b.m1();
	b.m3();
	
}
}//outer class
public class Non_Static_InnerClass{

	public static void main(String[] args) {
		EX e=new EX();
		e.m2();
		EX.Bn b=e.new Bn();
		b.m1();
		b.m3();
		
	}

}
