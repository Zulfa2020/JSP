package com.nt;
/*
//creating multiple custom threads to execute same logic from all threads
public class Multithreading_3 extends Thread {
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(getName()+"Run:"+i);
	}
}
	public static void main(String[] args) {
		Multithreading_3 m1=new Multithreading_3();
		m1.start();
		Multithreading_3 m2=new Multithreading_3();
		m2.start();
		Multithreading_3 m3=new Multithreading_3();
		m3.start();
	}

}
*/
/*
//program creating multiple user defined threads to execute
//same logic concurrently with different state initializing object with setter method
                                                        
class mythread extends Thread{
	int x;
	public void setX(int x){
		this.x=x;
	}
	 public void run() {
		 for(int i=0;i<this.x;i++) {
			 System.out.println(getName()+"Run: "+i);
		 }
	 }
}

class Multithreading_3{
	 public static void main(String[] args) {
		 mythread mt=new mythread();
		 mt.setX(3);
		 mt.start();
		 mythread mt1=new mythread();
		 mt1.setX(4);
		 mt1.start();
		 
		
		 for(int i=0;i<4;i++) {
			 System.out.println("Main: "+i);
		 }
	 }
}
*/

/*
//program creating multiple user defined threads to execute
//different logic 
class AddThread extends Thread{
	int sum=0;
	public void run() {
		 for(int i=0;i<7;i++) {
			 sum+=1;
			 System.out.println("Summation: "+sum);
		 }
	}
}
class SubThread extends Thread{
	int diff=0;
	public void run() {
		 for(int i=0;i<7;i++) {
			 diff+=1;
			 System.out.println("Difference: "+diff);
		 }
	}
}
public class Multithreading_3{
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		AddThread add=new AddThread();
		add.start();
		SubThread sub=new SubThread();
		sub.start();
		System.out.println("Main Exited");
		
		
	}
}
*/
/*
//Overriding Start() method
class Multithreading_3 extends Thread{
	int diff=0;
	public void run() {
		 for(int i=0;i<7;i++) {
			 diff+=1;
			 System.out.println("Difference: "+diff);
		 }
	}
	public void start() {
		System.out.println("start");
		int sum=0;
		
			 for(int i=0;i<7;i++) {
				 sum+=1;
				 System.out.println("Summation: "+sum);
			 }
			 super.start();
			
	}//start
	public static void main(String[] args) {
		Multithreading_3 st=new Multithreading_3();
	st.start();
	System.out.println("main");
	}
}
*/
