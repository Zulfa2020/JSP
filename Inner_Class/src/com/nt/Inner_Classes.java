package com.nt;

public class Inner_Classes {
	
	//Static inner class
	static class A{
		private int y=30;
		static void m1() {
			System.out.println("Static innerclass sm1");
		}
		 void m2() {
			System.out.println("non-Static innerclass nsm2");
		}
		
	}//Static inner class 
		public static void main(String[] args) {
			

		A.m1();//calling using Static inner class name because it is a static method.
		A a=new A();
		System.out.println("y:"+a.y);
		a.m2();//calling using an object of Static inner class.
		
	}//main
	

}//class
