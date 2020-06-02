package com.nt;

class Example
{
	static {
		Thread th=Thread.currentThread();
		System.out.println("Example class is loaded through the thread: "
		+th.getName());
	}
	static void m1() {
		Thread th=Thread.currentThread();
		System.out.println("Example class m1() is executing  the thread: "
		+th.getName());
	
	 }
	}
class MyThread extends Thread {
	public void run() {
		Example.m1();
	}
}
public class Current_Thread_Method {

	public static void main(String[] args) {
		new MyThread().start();
		//new Example().m1();
		
	}

}
