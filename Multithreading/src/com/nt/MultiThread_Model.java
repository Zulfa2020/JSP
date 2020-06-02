package com.nt;

public class MultiThread_Model extends Thread {
static PrintNumbers pn=new PrintNumbers();

public void run() {
	pn.print50to1();
	
}
	public static void main(String[] args) {
	MultiThread_Model mtm=new MultiThread_Model();
	long time1=System.currentTimeMillis();
	mtm.start();
	
	pn.print1to50();
	long time2=System.currentTimeMillis();
	System.out.println("Time Taken(secs):: "+((time2-time1)/1000)+"seconds");
	
	}

}
