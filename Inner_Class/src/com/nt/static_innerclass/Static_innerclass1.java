package com.nt.static_innerclass;

public class Static_innerclass1 {
                   static {
                	   System.out.println("Outer class is loaded");
                   }
                   Static_innerclass1(){
                	   System.out.println("Outer class constructor");
                   }
                   static class A{
                	   static {
                    	   System.out.println("Inner class is loaded");
                       }
                	   A(){
                		   System.out.println("Inner class constructor");
                	   }
                	   static void m1() {
                		   System.out.println("inner class SM");
                	   }
                	   void m2() {
                		   System.out.println("inner class NSM");
                	   }
                	   public static void main(String[] args) {
                		   System.out.println("inner class main");
                		   Static_innerclass1.m3();
                		   Static_innerclass1 s=new Static_innerclass1();
                		   s.m4();
                    
                	   }
                   }//class
                   static void m3() {
            		   System.out.println("Outer class SM");
            	   }
                   void m4() {
            		   System.out.println("Outer class NSM");
            	   }
                   
	public static void main(String[] args) {
		A.m1();
		A a=new A();
		a.m2();
		
		
	}

}
