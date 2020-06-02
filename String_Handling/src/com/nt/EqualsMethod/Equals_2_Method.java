package com.nt.EqualsMethod;

public class Equals_2_Method {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Ali","Cj");
		Student s2=new Student(102,"Abdi","AdvJava");
		Student s3=new Student(101,"Aki","Cj");
		Student s4=s2;
		System.out.println(s1==s2);//false, because their references are different.
		System.out.println(s1.equals(s2));//false, because their data is different. 
		System.out.println();
		
		System.out.println(s1==s3);//false,different references
		System.out.println(s1.equals(s3));//true, same data but different references
		System.out.println();
		
		System.out.println(s2==s4);//true, s4 referenced variable is assigned to s2 referenced object.
		System.out.println(s2.equals(s4));//true,both ref variables has same object ref.
		System.out.println();
		
		Address add=new Address();
		//System.out.println(s1==add);//C.E , incompatible types 
		System.out.println(s1.equals(add));//false , incompatible objects comparison.
	    
	
	     Address ad1=null;
	     Address ad2=null;
	     System.out.println(ad1==ad2);//true
	    // System.out.println(ad1.equals(ad2));//R.E,NullPointerException
	     System.out.println();
	     //comparing null with objects
	     Address ad3=new Address();	     
	     System.out.println(ad3==ad2);//false,different references
	     System.out.println(ad3.equals(ad2));//false ,object reference cannot invoke null reference.
	     System.out.println();
	    
	     System.out.println(s1.equals(101));//false --> s1 cannot invoke Integer reference
	     System.out.println(s1.equals('a'));//false ---> s1 cannot invoke String reference
	     System.out.println(s1.equals(null));//false ---> s1 cannot invoke null reference
	     
	     
	     
	     
	}//main

}
