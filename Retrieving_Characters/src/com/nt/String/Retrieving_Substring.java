package com.nt.String;

public class Retrieving_Substring {

	public static void main(String[] args) {
		String s1="Java Programming Language";
		System.out.println(s1.substring(5));//Programming Language
		System.out.println(s1.substring(5,11));//Progra
		System.out.println(s1.substring(5,12));//Program
		System.out.println(s1.substring(5,5));//empty string
		//System.out.println(s1.substring(12,5));//SIOBE
		//System.out.println(s1.substring(-1,12));//SIOBE
		//System.out.println(s1.substring(4,27));//SIOBE
		System.out.println(s1.substring(5,25));//Programming Language
		System.out.println();
		
		String s2="Java Programming Language";
		System.out.println(s2.substring(5,12));//Program
		
		int start=s2.indexOf("Program");//start=5
		int end=start+7;
		System.out.println(s2.substring(start,end));//Program
			
	
	}

}
