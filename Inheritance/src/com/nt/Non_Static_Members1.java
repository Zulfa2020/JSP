package com.nt;

class Example1{
	static int a=m1();
	static {
		System.out.println("Example Static-Block");
	}
	int x=m2();
	{
		System.out.println("Example Non-Static Block");
	}
	Example1(){
		System.out.println("Example Constructor");
	}
	static int m1() {
		System.out.println("Example SV is created");
	    return 10;
	}
	int m2() {
		System.out.println("Example NSV is created");
		return 20;
	}
	void abc() {
		System.out.println("Example abc");
	}
	void bbc() {
		System.out.println("Example bbc");
	}
	
	
	
}//class
public class Non_Static_Members1 extends Example1 {
	static int b=m3();
	static {
		System.out.println("Non_Static_Members1 Static-Block");
	}
	int y=m4();
	{
		System.out.println(" Non_Static_Members1 Non-Static Block");
	}
	Non_Static_Members1(){
		System.out.println("Non_Static_Members1 Constructor");
	}
	static int m3() {
		System.out.println("Non_Static_Members1 SV is created");
	    return 30;
	}
	int m4() {
		System.out.println("Non_Static_Members1 NSV is created");
		return 40;
	}
	void abc() {
		System.out.println("Non_Static_Members1 abc");
	}
	

	public static void main(String[] args) {
		System.out.println("Non_Static_Members1 Main Method");
		Non_Static_Members1 sa=new Non_Static_Members1();
	System.out.println(" A:"+sa.a);	
		
	System.out.println(" X:"+sa.x);	
	System.out.println(" B:"+sa.b);	
	System.out.println(" Y:"+sa.y);	
	
	    sa.abc();
		sa.bbc();
	
	}

}//class
