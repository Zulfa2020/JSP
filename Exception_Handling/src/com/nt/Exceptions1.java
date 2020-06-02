package com.nt;

import java.util.Scanner;

public class Exceptions1 {

	
	 public static void main(String[] args) {
		 /*
	try {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println(c);
		
		}	
	catch(ArrayIndexOutOfBoundsException arr) {
		System.out.println("please pass atleast two integer values");
		arr.printStackTrace();
	}
catch(NumberFormatException nfe) {
		System.out.println("please pass only integer values");
	}
catch(ArithmeticException ae) {
		System.out.println("please donot pass second value as zero");
	}
	
	}
*/
		 try {
		System.out.println("in outer try ");
		//System.out.println(10/0);
		
		try {
			System.out.println("in inner try ");
			System.out.println(10/0);
			
		}
		catch(ArithmeticException  fe) {
			System.out.println("in inner catch ");
				
		}
	
		 System.out.println("after inner try");
		 }
	catch(ArithmeticException e) {
		System.out.println("in outer catch ");
		
	}
		 System.out.println("after outer catch");
			
		 
}
}//class
