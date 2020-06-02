package com.nt.String;

public class LastIndex_IndexOf {

	public static void main(String[] args) {
		String s1="Java Programming Language";
		System.out.println(s1.length());
		System.out.println();
		System.out.println(s1.indexOf('a'));//1
		System.out.println(s1.lastIndexOf('a'));//22
		System.out.println();
		System.out.println(s1.indexOf('A'));//R.E because of case sensitive
		System.out.println(s1.lastIndexOf('A'));//R.E because of case sensitive
		System.out.println();
		System.out.println(s1.indexOf("Program"));//5
		System.out.println(s1.lastIndexOf("Program"));//11
		System.out.println();
		System.out.println(s1.indexOf('a',5));
		System.out.println(s1.lastIndexOf('a',5));
		System.out.println();
		System.out.println(s1.indexOf('a',30));
		System.out.println(s1.lastIndexOf('a',30));
		System.out.println();
		System.out.println(s1.indexOf('a',1));
		System.out.println(s1.lastIndexOf('a',1));
		System.out.println();
		System.out.println(s1.indexOf('a',24));
		System.out.println(s1.lastIndexOf('a',24));
		System.out.println();
		System.out.println(s1.indexOf('a',0));
		System.out.println(s1.lastIndexOf('a',0));
		System.out.println();
		System.out.println(s1.indexOf('a',-5));
		System.out.println(s1.lastIndexOf('a',-5));
		System.out.println();
		 
		String s2="JavaHariKrishna";
		System.out.println(s2.indexOf("hari"));//not available in this string,because of case sensitive
		System.out.println();

		String s3=s2.toLowerCase();
		System.out.println(s3.indexOf("hari"));//4
		System.out.println(s2);//JavaHariKrishna
		System.out.println(s3);//	JavaHariKrishna	

	}

}
