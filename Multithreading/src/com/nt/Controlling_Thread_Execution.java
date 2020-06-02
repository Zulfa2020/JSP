package com.nt;
//Working with Yield() method
/*
class MyYield extends Thread{
	public void run() {
		System.out.println("run");
	}
}
public class Controlling_Thread_Execution {

	public static void main(String[] args) {
		System.out.println("main start");
	
		MyYield mt=new MyYield();
	mt.start();
	Thread.yield();
	System.out.println("main end");
	
	
	}

}
*/
//Working with sleep() method
/*
class MySleep extends Thread{
	public void run() {
		System.out.println("run");
		
	}
}
public class Controlling_Thread_Execution {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main start");
	
		MySleep mt=new MySleep();
	mt.start();
	Thread.sleep(5000);
	System.out.println("main end");
	Thread.sleep(2000);
	System.out.println("main end");
	
	
	}

}
*/
/*
//Working with interrupt() method
class MySleep extends Thread{
	public void run() {
		System.out.println("run start");
		try {
		System.out.println("Before pause-1");
		Thread.sleep(5000);
		}
		catch(InterruptedException ie) {
			System.out.println("IE is Raised");
		}
		System.out.println("After pause-1");
		
		try {
			System.out.println("Before pause-2");
			Thread.sleep(10000);
			}
			catch(InterruptedException ie) {
				System.out.println("IE is Raised");
			}
			System.out.println("After pause-2");
			System.out.println("run end");
	}
}
public class Controlling_Thread_Execution {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main start");
	
		MySleep mt=new MySleep();
	//	mt.interrupt();
	mt.start();
	mt.interrupt();
	//mt.interrupt();
	Thread.sleep(2000);
	mt.interrupt();
	
	System.out.println("main end");
	
	
	}

}
*/
