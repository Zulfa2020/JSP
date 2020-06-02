package com.nt.Mobile_Email_Validation;

import java.util.Scanner;

public class Read_Password {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	while(true) {
		System.out.println("Enter Password::");
		String psw=scn.nextLine();
		
		if(psw.isEmpty()) {
			System.out.println("Password cannot be empty");
			continue;
		}
		
		else {
			int len=psw.length();
		if(len<8 || len>16) {
			System.out.println("Password should be between 8 and 16");
			continue;
		}
		else {
			System.out.println("Account Registered. ");
			break;
			}
		}
		
			
		
	}//while
	scn.close();
	}//main

}//class
