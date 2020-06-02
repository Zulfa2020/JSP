package com.nt;
class Ali{
	static int a=10;
	static {
		System.out.println("class ALI SB");
		System.out.println("a: "+a);
		//System.out.println("b: "+b);//C.E
		System.out.println("b: "+Static_Members3.b);
		
	}
	
	public static void main(String[] args) {
		System.out.println("class Ali MM");
		System.out.println("a: "+a);
		System.out.println("b: "+Static_Members3.b);
	}

}
public class Static_Members3 extends Ali{
	static int b=20;
	static {
		System.out.println("class Static_Members3 SB");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}
	public static void main(String[] args) {
		System.out.println("class Static_Members3 MM");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}

