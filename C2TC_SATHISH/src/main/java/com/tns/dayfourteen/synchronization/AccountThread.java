package com.tns.dayfourteen.synchronization;

public class AccountThread {
	private Account acc;
	private int amt;
	
	public AccountThread(Account acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		start();
		
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}
	public void run()
	{
		/* Using Synchronized Block - withdraw() is non synchronized
		 * synchronized (acc) 
		 * { 
		 * acc.withdraw(amt); 
		 * }
		 */		
		
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}
}
