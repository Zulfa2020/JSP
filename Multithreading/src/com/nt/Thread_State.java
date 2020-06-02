package com.nt;
//Retrieving Thread object state name
/*
class MyThread extends Thread{
	public void run() {
		System.out.println(" run start ");
		System.out.println("from run method,mt state after start call= "+this.getState());
	
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie) {}
			System.out.println(" run end ");
	}
}
public class Thread_State {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt=new MyThread();
		System.out.println("from main method after object creation= "
		                                                   +mt.getState());
	
		mt.start();
		System.out.println("from main method mt state after after start call= "
		                                                    +mt.getState());
		Thread.sleep(500);
		System.out.println("from main method after mt.sleep() call= = "
		                                                     +mt.getState());
		Thread.sleep(6000);
		System.out.println("from main method mt state after run completed= "
		                                                      +mt.getState());
	}

}
*/
//showing if Thread is Alive or not
/*
class MyThread extends Thread{
	public void run() {
		System.out.println(" run start ");
		System.out.println("from run method,mt state after start call= "+this.isAlive());
	
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie) {}
			System.out.println(" run end ");
	}
}
public class Thread_State {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt=new MyThread();
		System.out.println("from main method after object creation= "
		                                                   +mt.isAlive());
	
		mt.start();
		System.out.println("from main method mt state after after start call= "
		                                                    +mt.isAlive());
		Thread.sleep(500);
		System.out.println("from main method after mt.sleep() call= = "
		                                                     +mt.isAlive());
		Thread.sleep(6000);
		System.out.println("from main method mt state after run completed= "
		                                                      +mt.isAlive());
	}

}
*/

