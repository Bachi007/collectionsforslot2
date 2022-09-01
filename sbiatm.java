package com.bankApp;


class customer{
	
	int bankBal=10000;
	public synchronized void withdraw(int amt) {

		System.out.println("---welcome to withdraw---");
		if(this.bankBal<amt) {

			System.out.println("Low balance, try again");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}	
		}
		this.bankBal-=amt;
		System.out.println("Withdraw completed");
		
		}
		
	
	public synchronized void deposit(int amt) {
	
		{
			System.out.println("--depositing---");
			this.bankBal+=amt;
			System.out.println("--deposit done---");
			notify();
		}
	
	
	}
	
	
}


public class sbiatm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c=new customer();
		Thread t1=new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				c.deposit(10000);
			}
		};
		
		t1.start();
		t2.start();		
		
	}

}
