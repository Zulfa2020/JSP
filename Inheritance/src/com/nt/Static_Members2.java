package com.nt;
class B{
	static int a=10;
	static {
		System.out.println(" in B SB");
		System.out.println("A: "+a);
		//System.out.println("B: "+b);
		System.out.println("B: "+Static_Members2.b);
		System.out.println("B: "+Static_Members2.getB());
	}
}//class
public class Static_Members2 extends B{
	static int b=20;
	static {
		System.out.println(" in Static_Members2 SB");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("B: "+Static_Members2.getB());
	}
	static int getB() {
		return b;
		
		
	}
	public static void main(String[] args) {
		System.out.println("in Static_Members2 Main");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
		
	}

}
