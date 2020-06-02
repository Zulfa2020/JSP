package com.nt;
class A{
	static int a=m1();
	static {
		System.out.println("Class A SB");
	}
	int x=m2();
	A(){
		System.out.println("Class A CONSTRUCTOR");
	}
	static int m1() {
		System.out.println("Class A NSV");
		return 10;
	}
	int m2() {
		System.out.println("Class A NSV");
		return 20;
	}
	void abc() {
		System.out.println("Class A abc");
	}
	void bbc() {
		System.out.println("Class A bbc");
	}
	
}//class A
public class IE extends A {
	static int b=m3();
	static {
		System.out.println("Class IE SB");
	}
	int y=m4();
	IE(){
		System.out.println("Class IE CONSTRUCTOR");
	}
	static int m3() {
		System.out.println("Class IE NSV");
		return 30;
	}
	int m4() {
		System.out.println("Class IE NSV");
		return 40;
	}
	void abc() {
		System.out.println("Class IE abc");
	}
	
	
public static void main(String[] args) {
		System.out.println("Class IE Main()");
		IE ie=new IE();
      ie.abc();
      ie.bbc();
      
		//System.out.println("Class IE :"+ie.a);	
        //System.out.println("Class IE :"+ie.b);	

}

}
