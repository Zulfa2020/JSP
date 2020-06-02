package com.nt.String;

import java.util.Scanner;

class StringReverse{
	static String reverseWords(String s) {
		String[] words=s.split("");
		String result="";
		for(int i=(words.length-1);i>=0;i--) {
			result=result+words[i]+"";
		}
		return result.trim();
	}
}
public class ReverseString_Method {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter string:");
		String s1=scn.nextLine();
		System.out.println("you entered:"+s1);
		String result=StringReverse.reverseWords(s1);
		System.out.println("REsult:"+result);
		
		scn.close();
	}//main

}//class
