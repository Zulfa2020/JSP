package com.nt.Mobile_Email_Validation;

import java.util.Scanner;

public class Email_Validator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
			System.out.println("Enter Email::");
			String email=scn.nextLine();
			int atIndex;
			if(((atIndex=email.indexOf('@'))!=-1) && (email.indexOf('.',atIndex))!=-1)  {
				System.out.println("Registered");
			}
			else
				System.out.println("Invalid Email.");
			
			scn.close();
	}

}
