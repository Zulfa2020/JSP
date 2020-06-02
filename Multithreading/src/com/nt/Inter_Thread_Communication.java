package com.nt;
class Factory{
	int items;
	boolean itemsInFactory;
	synchronized void produce() {
		if(itemsInFactory) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.items=this.items+items;
		itemsInFactory=true;
		System.out.println("Produced items: "+items);
		notify();
	}//produce
	synchronized int consume() {
		if(itemsInFactory) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.items=this.items-items;
		System.out.println("Consumed items: "+items);
		
		itemsInFactory=false;
		notifyAll();
		return items;
	}//
}//class
class Producer implements Runnable{
	Factory fa;
	Producer(Factory fa){
		this.fa=fa;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int i=1;
		while(i<=10) {
			fa.produce();
			i++;
		}
	}
}
class Consumer implements Runnable{
	Factory fa;
	 Consumer(Factory fa){
		this.fa=fa;
		new Thread(this," Consumer").start();
	}
	public void run() {
		int i=1;
		while(i<=10) {
			fa.consume();
			i++;
		}
	}
}
public class Inter_Thread_Communication {

	public static void main(String[] args) {
		Factory ba=new Factory();
		new Producer(ba);
		new Consumer(ba);
	}

}
