package com.nt;
/*
//Overriding start() to execute some logic 
class MultiThreading_6 extends Thread{
	int a=10,b=20,c,sum;
	
	public void run() {
		System.out.println("run");
		
		sum=a+b;
		System.out.println("Sum: "+sum);
	}
	public void start() {
		System.out.println("start");
		c=a+b;
		System.out.println("Add: "+c);
		run();
		super.start();
	}
	public static void main(String[] args) {
		MultiThreading_6 t=new MultiThreading_6();
		t.start();
		System.out.println("Main");
	}

}
*/
/*
//creating one custom thread from another custom thread
class m1 extends Thread{
	public void run() {
		for(int i=1;i<3;i++) {
			System.out.println("M1 run: "+i);
		}
	}
}

class m2 extends Thread{
	public void run() {
		m1 mt1=new m1();
		mt1.start();
		
		for(int i=1;i<3;i++) {
			System.out.println("M2 run: "+i);
		}
	}
}




class MultiThreading_6{
	public static void main(String[] args) {
		System.out.println("Main start");
	m2 m=new m2();
	m.start();
	System.out.println("Main exited");
	}
}
*/

