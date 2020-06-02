package com.nt;
//modifying object data(non-static variable data)with and without synchronization
/*
class Add{
	int x,y;
	 //synchronized void add(int x,int y) {
		 void add(int x,int y) {
		this.x=x;
		this.y=y;
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();}
		int res=this.x+this.y;
		System.out.println("In"+Thread.currentThread().getName()+"Result: "+res);
	}
}//class
class Thread1 extends Thread{
	Add a;
	Thread1(Add a){
		this.a=a;
	}
public void run() {
	a.add(50,60);
}
}
class Thread2 extends Thread{
	Add a;
	Thread2(Add a){
		this.a=a;
	}
public void run() {
	a.add(50,60);
}
}
public class Synchronnization {

	public static void main(String[] args) {
		Add a=new Add();
		Thread1 t1=new Thread1(a);
		t1.start();
		t1.setName("Child1");
		Thread2 t2=new Thread2(a);
		t2.start();
        t2.setName("Child2");
		
	}

}
*/

//modifying object data(non-static variable data)with and without synchronization
/*
class Add{
	static int x,y;
	 static synchronized void add(int x,int y) {
		//static void add(int x,int y) {
		x=x;
		y=y;
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();}
		int res=x+y;
		System.out.println("In"+Thread.currentThread().getName()+"Result: "+res);
	}
}//class
class Thread1 extends Thread{
	
public void run() {
	Add.add(50,60);
}
}
class Thread2 extends Thread{
	
public void run() {
   Add.add(50,60);
}
}
public class Synchronization {

	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		t1.start();
		t1.setName("Child1");
		Thread2 t2=new Thread2();
		t2.start();
        t2.setName("Child2");
		
	}

}
*/


//a program to display numbers sequentially form multiple threads using 1 or 2 object
/*
class Pnum {
	synchronized void display() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"run: "+i);
		}
	}
}
class MySync extends Thread{
	Pnum p;
	MySync(Pnum p){
		this.p=p;
	}
	public void run() {
		p.display();
	}
}
public class Synchronization {

	public static void main(String[] args) {
		//case1:Sharing same Object
		
		Pnum pn=new Pnum();
		 MySync ms=new  MySync(pn);
		 MySync ms1=new  MySync(pn);
       ms.start();
       ms1.start();
		 
		//case2:Sharing Different Objects
		
       Pnum pn=new Pnum();
       Pnum pn1=new Pnum();
	   MySync ms=new  MySync(pn);
		 MySync ms1=new  MySync(pn1);
     ms.start();
     ms1.start();
		 
		 
	}
}
*/
//Another Example of Synchronization
class Pmsg{
	//void printmsg(String msg) {
	synchronized void printmsg(String msg) {
		System.out.print("["+msg);
		try {
		Thread.sleep(1000);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class MsgPrint extends Thread{
	String msg;
	Pmsg pm;
	Thread th;
	public MsgPrint(String msg, Pmsg pm) {
		
		this.msg = msg;
		this.pm = pm;
		th=new Thread(this);
		th.start();
	}
	public void run() {
		pm.printmsg(msg);
	}
	
}//class 
public class Synchronization {

	public static void main(String[] args) {
		Pmsg pm=new Pmsg();
		MsgPrint mp=new MsgPrint("Hi",pm);
		MsgPrint mp2=new MsgPrint("HiHello",pm);
		MsgPrint mp1=new MsgPrint("Hello",pm);
		
		
	}
	}
	