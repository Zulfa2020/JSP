package com.nt;

import java.util.HashSet;

public class Overriding_Hashcode_Equals_Tostring_Methods {

	public static void main(String[] args) {
	Student s1=new Student(101,"Ali","ADV");//new object --->(HS)
	Student s2=new Student(102,"Anko","CJ");//new object --->(HS)
	Student s3=new Student(101,"Abdi","ADV");//object not created (HS-->EQ)
	Student s4=new Student(103,"Ziko","HTML");//new object --->(HS)
	Student s5=new Student(103,"Zayn","HTML");//object not created (HS-->EQ)
	
	
	HashSet<Student> hs=new HashSet <>();
	hs.add(s1);System.out.println();
	hs.add(s2);System.out.println();
	hs.add(s3);System.out.println();
	hs.add(s4);System.out.println();
	hs.add(s5);System.out.println();
	System.out.println(hs);
	
	
	}

}
