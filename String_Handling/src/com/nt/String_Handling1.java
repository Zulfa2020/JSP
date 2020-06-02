package com.nt;

import java.util.*;

public class String_Handling1 {

	public static void main(String[] args) {
		//isEmpty() 
		/* String s1="";
	    String s2=" ";
		String s3="a";
		String s4=new String();
		String s5=new String("");
		String s6=new String(" ");
		String s7=new String("a"); 

		System.out.println("is s1 Empty ::"+s1.isEmpty());
		System.out.println("is s2 Empty ::"+s2.isEmpty());
		System.out.println("is s3 Empty ::"+s3.isEmpty());
		System.out.println("is s4 Empty ::"+s4.isEmpty());
		System.out.println("is s5 Empty ::"+s5.isEmpty());
		System.out.println("is s6 Empty ::"+s6.isEmpty());
		System.out.println("is s7 Empty ::"+s7.isEmpty());*/

		/*Length()
		System.out.println("s1 Length ::"+s1.length());
		System.out.println("s2 Length ::"+s2.length());
		System.out.println("s3 Length ::"+s3.length());
		System.out.println("s4 Length ::"+s4.length());
		System.out.println("s5 Length ::"+s5.length());
		System.out.println("s6 Length ::"+s6.length());
		System.out.println("s7 Length ::"+s7.length()); */

		/*printing string object content
		System.out.println("****************************************");
		String b="Hari";
		System.out.println("b :"+b);
		System.out.println("b :"+b.toString());
		System.out.println();
		System.out.println("****************************************");

		String b1=new String("Naresh_Hari");
		System.out.println("b1 :"+b1);
		System.out.println("b1 :"+b1.toString());
		 */

		/* Comparing string object data with available SBUFFER and SBUILDER objects
			 String b1=new String("a");
			String b2=new String("a");
			StringBuffer b3=new StringBuffer("a");

			System.out.println(b1.equals(b2));//true
			System.out.println(b1.contentEquals(b2));//true

			System.out.println(b1.equals(b3));//false
			System.out.println(b1.contentEquals(b3));//true
		 */

		/* searching for sub string

			 String s="javaHariKrishna";

			System.out.println(s.contains(new StringBuffer('a')));//true
			System.out.println(s.contains("a"));//true
			System.out.println(s.contains("A"));//false
			System.out.println(s.contains("Hari"));//true
			System.out.println(s.contains("hari"));//false
			System.out.println(s.equals("Hari"));//false
			System.out.println(s.contains("Hari"));//true
			System.out.println(s.equals("javaHari"));//false
			System.out.println(s.contains("javaHari"));//true*/

		/*startsWith() and endsWith()
			String s1="abc bbc cbc";
			System.out.println(s1.startsWith("abc"));//true
			System.out.println(s1.endsWith("abc"));//false

			System.out.println(s1.startsWith("cbc"));//false
			System.out.println(s1.endsWith("cbc"));//true

			System.out.println(s1.startsWith("abc bbc"));//true
			System.out.println(s1.endsWith("abc bbc"));//false

			System.out.println(s1.startsWith("bbc cbc"));//false
			System.out.println(s1.endsWith("bbc cbc"));//true

			System.out.println(s1.startsWith("Abc"));//false
			System.out.println(s1.endsWith("Cbc"));//false*/

		/* Concat() and append() method
			String s1="Ali";
			String s2=s1.concat(" Zulfa");
			System.out.println(s1);
			System.out.println(s2);

			StringBuffer sb=new StringBuffer("ali");
			sb.append(" zulfa");
			System.out.println(sb);

			StringBuilder sb1=new StringBuilder("aliaka");
			sb1.append(" zulfa khan");
			System.out.println(sb1);
		 */


		//checking isEmpty or trim
		/*
		Scanner scn=new Scanner(System.in);
		while(true) {
			System.out.println("Enter Username::");
			String usn=scn.nextLine();
			if(usn.isEmpty()) {
				System.out.println("username cannot be empty");
				System.out.println();
			}

			else if(usn.trim().isEmpty()) {
				System.out.println("username cannot be spaces");
				System.out.println();

			                         }

			else 
		                System.out.println("welcome to NIT");
			System.out.println();



			}
		 */

		//tostring() method
		/*	String s1="Ali";
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println();

		String s2=new String("Ali Moha");
		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println();
		String s3=null;
		System.out.println(s3);
		//System.out.println(s3.toString());//NullPointerException

		Exam ex=new Exam(100);
		System.out.println("ex:"+ex);

		Exam ex1=null;
		System.out.println("ex1:"+ex1);

	//Exam ex2;
	//	System.out.println("ex2:"+ex2);//CE
		 */

   /*
     // UPPERCASE AND LOWERCASE
		String s1="aBc";
		System.out.println(s1);
		String s2=s1.toLowerCase();
		System.out.println(s2);
      System.out.println();
      String s3=s1.toUpperCase();
		System.out.println(s3);
		
		//System.out.println();
		// s1=s1.toUpperCase();
		// System.out.println(s1);
		// s1=s1.toLowerCase();
		// System.out.println(s1);
		 
		 String sb1="12@34";
		 String sb2=sb1.toLowerCase();
		 String sb3=sb1.toUpperCase();
		 System.out.println(sb1);
	     System.out.println(sb2);
		 System.out.println(sb3);
		 System.out.println();
		 System.out.println(sb1==sb2);
		 System.out.println(sb2==sb3);
		 System.out.println(sb1==sb3);
		 
		// String sa1=null;
		 //System.out.println(sa1.toLowerCase());//NPE
		 
		 //String[] sa2=new String[5];
		// System.out.println(sa2[0].toUpperCase());//NPE
		 
		 */
		
			



	}//main


}//class
