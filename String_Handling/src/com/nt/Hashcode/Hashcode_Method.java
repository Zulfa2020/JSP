package com.nt.Hashcode;

public class Hashcode_Method {

	public static void main(String[] args) {
		Example2 e1=new Example2(5);
		Example2 e2=new Example2(5);
		
		System.out.println("e1:"+e1.hashCode());//5-> data-wise
		System.out.println("e2:"+e2.hashCode());//5-> data-wise
		
		System.out.println("e1:"+System.identityHashCode(e1));//referenced wise
		System.out.println("e2:"+System.identityHashCode(e2));//referenced wise
		System.out.println();
		
		e1.x=100;
		e2.x=101;
		System.out.println("e1:"+e1.hashCode());//100-> data changes
		System.out.println("e2:"+e2.hashCode());//101-> data changes
		
		System.out.println("e1:"+System.identityHashCode(e1));//referenced  doesn't change 
		System.out.println("e2:"+System.identityHashCode(e2));//referenced doesn't change
		System.out.println();
		
		
		
		String s="b";
		String s3="b";
		System.out.println("s:"+s.hashCode());//98-> data-wise
		System.out.println("s3:"+s3.hashCode());//98-> data-wise
		
		System.out.println("s:"+System.identityHashCode(s));//referenced wise 
		System.out.println("s3:"+System.identityHashCode(s3));//referenced wise
		
		System.out.println();
		
		String s1=new String("a");
		String s2=new String("a");
		System.out.println("s1:"+s1.hashCode());//97-> data-wise
		System.out.println("s2:"+s2.hashCode());//97-> data-wise
		
		System.out.println("s1:"+System.identityHashCode(s1));//referenced wise
		System.out.println("s2:"+System.identityHashCode(s2));//referenced wise
		
		
		
		
		
		
	
	
	}//main

}//class
