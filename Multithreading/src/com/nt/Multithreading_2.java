package com.nt;
/*
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("From MyRunnable.run()");
	}
}
class MyThread extends Thread{
	MyThread(){
		super();
		
	}
	MyThread(Runnable target){
		super(target);
		
	}
	public void run() {
		System.out.println("From MyThread.run()");
		
	}
	
	
}
public class Multithreading_2 {
             public static void main(String[] args) {
           
            	 //case:1
                 Thread t1=new Thread();
            	 t1.start();
            //case:2
            	 MyThread mt=new MyThread();
            	 mt.start();
          	 
            	
            //case:3----- MyRunnable is not extended form thraed class where start() is available
            	 MyRunnable mr=new MyRunnable();
            	// mr.start();
          
           //case:4
            	 Thread t2=new Thread(mr);
            	 t2.start();
         
            	
          
            	 //case:5
            	  
            	 MyThread mt1=new MyThread();
             	 Thread t3=new Thread(mt1);
            	 t3.start();
            	 
           //case:6
            	 //Thread t4=new MyThread();
            	 //t4.start();
            	 
       
        
            	 //case:7---cannot create MyRunnable object from thread class because it does'nt extend from thread class
            	 Thread t5=new MyRunnable();
            	 t5.start();
          //case:8-----reference variable is interface not thread class where start method is present
                 Runnable r=new MyRunnable();
            	 r.start();
           //case:9
            	 Thread t6=new Thread(r);
            	 t6.start();
          //case:10 ------reference variable is interface not thread class where start method is present
            	 Runnable r1=new MyThread();
            	 r1.start();
         //case:11
            	 Thread t7=new Thread(r);
            	 t7.start();
     
        
         //case:12--because of mt2 variable is of MyThread Type,MyThread.run is executed
            	 MyRunnable mr2=new MyRunnable();
            	 MyThread mt2=new MyThread(mr2);
            	 mt2.start();
            	 
         }
      }
   */
