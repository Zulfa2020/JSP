package com.nt;
 class Join extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(getName()+":"+i);
		if(i==5 && getName().equals("child2") ) {
			try { Thread.sleep(500);}
			catch(Exception e) {
				e.printStackTrace();
			}
		}//if
		
		
		}//for
		
	}//run
} //class
public class Join_Method {

	public static void main(String[] args)throws InterruptedException {
	System.out.println("main started");	
	
	Join j=new Join();
	j.setName("child1");
	j.start();
	
	Join j1=new Join();
	j1.setName("child2");
	j1.start();
	
	j.join();
	j1.join();
	
	System.out.println("main exited");
	
	
	}

}//class
