package com.nt;

public class Arrays101 {

	public static void main(String[] args) {
	
		//Approach 1
				int[] i1=new int[5];
				Array_102.m1(i1);
				int[] i= {3,4,5};
				//Approach 2
				Array_102.m1(i);
				//Approach 3
				int[] i2=new int[] {7,5,6,2,9};
				Array_102.m1(i2);
				
				//array object creation
				Array103[] ar= { new Array103(101,"Ali") };
				for(Array103 e:ar) {
					System.out.println("*********************");
					System.out.println(e);
					e.display();
					}
				
				//array object storing salaries
				double[] sal= {3000,4000,5000};
				double tot=0;
				System.out.println();
				System.out.println(sal[0]+"  "+sal[1]+"  "+sal[2]);
				System.out.println();
				
				for(double sa:sal) {
					
					tot+=sa;
					System.out.println(tot);
					System.out.println();
				}
				System.out.println("************");
				double sa1=sal[2];
				sal[2]=sa1+(sa1*20/100);
				System.out.println(sal[2]);

	}

}
