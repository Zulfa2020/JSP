package com.nt;

public class Operations_2 {

	public static void main(String[] args) {
		
		double day=100;
		double weekly=day*6;
		double sal=weekly*4;
		double annualSal=sal*12;
		System.out.println("Monthly Salary:"+sal);
		System.out.println("Annual Salary:"+annualSal);
		System.out.println();
		
		double annualSalAfterTax=annualSal*65/100;
		int e=4;
		if(e<1) {
			System.out.println("Fresher:"+annualSalAfterTax);
		}
		else if(e==1)   {
			System.out.println("Associate:"+(annualSalAfterTax*2));
		}
		else if( e>=2 && e<4 ) {
			System.out.println("Software Engineer:"+(annualSalAfterTax*3));
		}
		else if(e>=4) {
			System.out.println("Lead Software Engineer:"+(annualSalAfterTax*5));
		}
		
		
		
	
	}//main

}
