package com.nt.Encapsulation1;

import java.util.Scanner;

public class Encapsulation_BankAcc {
	//variable hiding.
        private double bal;
        private String name;
    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		//Passing value and validating it.    
        public void  setBal(double bal)throws Exception {
        	if(bal<0) {
        		throw new Exception("Balance cannot be negative number. ");
        	}
        	else {
        	       this.bal=bal;
        }
        	}//set
    //Returning Passed Value and displaying it. 
        public double getBal() {
        	return bal;
        }
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args)throws Exception {
		Scanner scn=new Scanner(System.in);
		Encapsulation_BankAcc acc=new Encapsulation_BankAcc();
		while(true) {
			try {
				System.out.println("Enter Name: ");
				String name=scn.nextLine();
			
			System.out.println("Enter Balance: ");
			Double amt=scn.nextDouble();
			
	    acc.setName(name);
		acc.setBal(amt);
		
		System.out.println("Name: "+acc.getName());
		System.out.println("Current Balance: "+acc.getBal());
		
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
	
		
		}//while
		
		
	}

}
