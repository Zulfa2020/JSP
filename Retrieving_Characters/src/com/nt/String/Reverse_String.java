package com.nt.String;

import java.util.Scanner;

class Reverse1_String{
	public static String reverse(String s) {
		StringBuilder sb=new StringBuilder(s.length());
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
			
		}
		return sb.toString();
		
	}
}
public class Reverse_String {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		while(true) {
			System.out.println("Enter String :: ");
		
			String s2=scn.nextLine();
			
			String res=Reverse1_String.reverse(s2);
			System.out.println(s2);
            System.out.println(res);
	
           
		}
	
	}
}//class

