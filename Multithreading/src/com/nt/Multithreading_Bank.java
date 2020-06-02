package com.nt;
class  BankAcc{
	String accholder;
	int accno;
	double bal;
	public BankAcc(String accholder, int accno, double bal) {
		
		this.accholder = accholder;
		this.accno = accno;
		this.bal = bal;
	}
	
	public void deposit(double amt) {
		System.out.println("Balance before Depositing: "+bal);
		
		bal=bal+amt;
		System.out.println("Balance After Depositing: "+bal);
	}
	
	
	 public void withdraw(double amt) {
		 System.out.println("Balance before Withdrawing: "+bal);
			
		bal=bal-amt;
		System.out.println(" Balance After Withdrawing : "+bal);
	}
}
class Depositor implements Runnable{
	public BankAcc acc;
	public double amt;
	 Thread th;
	public Depositor(BankAcc acc, double amt) {
		
		this.acc = acc;
		this.amt = amt;
		th=new Thread(this);
		th.start();
	}

	public void run() {
		acc.deposit(amt);
		
		System.out.println("Depositor Deposited Amount: "+amt);
		System.out.println();
	}
	public Thread getThread() {
		return this.th;
	}
	
}
class Withdrawer implements Runnable{
	public BankAcc acc;
	public double amt;
	 Thread th;
	public Withdrawer(BankAcc acc, double amt) {
		
		this.acc = acc;
		this.amt = amt;
		th=new Thread(this);
		th.start();
	}

	public void run() {
		System.out.println();
		acc.withdraw(amt);
		
		System.out.println("Withdrawer Withdrawed Amount: "+amt);
	}
	public Thread getThread() {
		return this.th;
	}
}
public class Multithreading_Bank {

	public static void main(String[] args) throws InterruptedException {
		BankAcc acc1=new BankAcc("HK",101,5000);
		BankAcc acc2=new BankAcc("PK",102,4000);
		
		Depositor d=new Depositor(acc1,500);
		
		Withdrawer d1=new Withdrawer(acc2,1000);
		
		d.getThread().join();
		d1.getThread().join();
	}

}
