package com.nt;

public class Arrays_104 {

	public static void main(String[] args) {
		int[][] arr= { {8,9},{6,7},{4,5} };
		   
		   for(int[] ca:arr) {
			   System.out.println(ca);
			   for(int i:ca) {
				   System.out.print("  "+i);
				   
			   }
			   System.out.println();
		   }
		   arr[2][0]=arr[0][1]+arr[1][0];
		   System.out.println(arr[2][0]);
		   
		   System.out.println();
		   arr[1][0]=arr[2][1]+arr[1][1];
		   System.out.println(arr[1][0]);
	}

}
