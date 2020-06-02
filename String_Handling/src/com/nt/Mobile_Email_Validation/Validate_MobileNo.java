package com.nt.Mobile_Email_Validation;

import java.util.Scanner;

public class Validate_MobileNo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		while(true) {
			System.out.println("Enter MobileNumber::");
			String mob=scn.nextLine();
			
			if(mob.isEmpty()) {
				System.out.println("MobileNumber cannot be empty");
				continue;
			}
			
			else {
				try {
					@SuppressWarnings("unused")
					long mn=Long.parseLong(mob);
					if(mob.length()!=10) {
						System.out.println("MobileNumber should be 10 digits");
					continue;
					}
					else {
						System.out.println("OTP is sent to your number");
					System.out.println("Enter OTP::"); 
					continue;
					}
				    
				}//try
				catch(NumberFormatException nfe) {
					System.out.println("Mobile number should contain only digits");
					continue;
				}
				
			}
				
			

		}//while
		
	}

}
