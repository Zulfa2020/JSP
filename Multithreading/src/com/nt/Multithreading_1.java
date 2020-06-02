package com.nt;
/*
//custom thread extending from thread class
public class Multithreading_1  extends Thread{
public void run() {
	System.out.println("run");
}
	public static void main(String[] args) {
		Multithreading_1 mt=new Multithreading_1();
		mt.start();
		System.out.println("main executed");
	}

}
*/

/*
//custom thread extending from Runnable Interface
public class Multithreading_1  implements Runnable{
public void run() {
	System.out.println("run executed");
}
	public static void main(String[] args) {
		Multithreading_1 mt=new Multithreading_1();
		//mt.start();
		Thread th=new Thread(mt);
		th.start();
		System.out.println("main executed");
	}

}
*/
/*
//multithreading program executing two tasks concurrently

 class mythread extends Thread{
	 public void run() {
		 for(int i=1;i<=20;i++) {
			 System.out.println("run: "+i);
		 }
	 }
 }
 class Multithreading_1{
	 public static void main(String[] args) {
		 mythread mt=new mythread();
		 mt.start();
		 //mt.run();
		 
		 for(int i=20;i>=1;i--) {
			 System.out.println("main: "+i);
		 }
	 
	 }
 }
*/

/*
//Multithreading program to execute two different tasks
class mythread1 extends Thread{
	 public void run() {
		 int sum=0;
		 
		 for(int i=1;i<=5;i++) {
			 sum+=i;
			 System.out.println("sum: "+sum);
		 }
	 }
}
class mythread2 extends Thread{
	 public void run() {
		 int diff=0;
		 
		 for(int i=5;i>=1;i--) {
			 diff-=i;
			 System.out.println("sub: "+diff);
		 }
	 }
}
class Multithreading_1{
	 public static void main(String[] args) {
		 mythread1 mt=new mythread1();
		 mt.start();
		 mythread2 mt1=new mythread2();
		 mt1.start();
		
	 
	 }
}
*/

/*
 
//program creating multiple user defined threads to execute
//                                    same logic concurrently with different state
                                                          
class mythread extends Thread{
	int x;
	mythread(int x){
		this.x=x;
	}
	 public void run() {
		 for(int i=0;i<this.x;i++) {
			 System.out.println(getName()+"Run: "+i);
		 }
	 }
}

class Multithreading_1{
	 public static void main(String[] args) {
		 mythread mt=new mythread(3);
		 mt.start();
		 mythread mt1=new mythread(4);
		 mt1.start();
		 mythread mt2=new mythread(2);
		 mt2.start();
		
		 for(int i=0;i<4;i++) {
			 System.out.println("Main: "+i);
		 }
	 }
}

*/

