package com.nt;

public class PrintNumbers {

	public void print50to1() {
		for(int i=50;i>=1;i--) {
			System.out.println(i+"\t");
		try {
			Thread.sleep(1000);}
		catch(InterruptedException ie) {ie.printStackTrace();}
		}
	}

	public void print1to50() {
		for(int i=1;i<=50;i++) {
			System.out.println(i+"\t");
		try {
			Thread.sleep(1000);}
		catch(InterruptedException ie) {ie.printStackTrace();}
		}
	}//

}//class
