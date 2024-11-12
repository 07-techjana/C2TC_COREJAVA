package com.tns.daythirteen;

public class MyChildThread {
	public void run() {
		System.out.println("In side run() Thread is alive or not? " + this.isAlive());
		int no = 0;
		while (no < 4) {
			no++;
			System.out.println("number = " + no);
			sleep(500);
		}
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}
}
