package com.nt;
class Daemon1 implements Runnable{
Thread th;
Daemon1(){
	th=new Thread(this);
    th.setDaemon(true);
    th.start();
    //th.setDaemon(true);
}
public void run() {
	System.out.println("Run: "+th.isDaemon());
for(int i=1;i<20;i++) {
	System.out.println("Run: "+i);
}

}
}
public class Daemon_Thread_Demo {

	public static void main(String[] args) {
		Daemon1 d=new Daemon1();
		System.out.println("***********Countdown Begins************");
		for(int i=1;i<5;i++) {
			System.out.println("Main: "+i);
		}

	}

}
