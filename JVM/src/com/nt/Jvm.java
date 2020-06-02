package com.nt;

import java.util.Scanner;

public class Jvm {
	
	
	
	int Sid;
	String Sname;
	String College;
	
		
	public static void main(String[] args) {
		
		Jvm j1=new Jvm();
	Scanner scn=new Scanner(System.in);
	
				System.out.println("Enter Student N.O:");
			int Sid=scn.nextInt();
			
			System.out.println();
			System.out.println("Enter Student Name:");
			String Sname=scn.nextLine();
			
			System.out.println();
			System.out.println("Enter College:");
			String College=scn.nextLine();
			
			System.out.println();
			System.out.println(j1.Sid);
			System.out.println(j1.Sname);
			System.out.println(j1.College);
			System.out.println();
		
		scn.close();
		
		
		
	
		
		
		
	}
	

}
