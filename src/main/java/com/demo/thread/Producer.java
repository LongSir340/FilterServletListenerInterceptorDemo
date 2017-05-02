package com.demo.thread;

public class Producer extends Thread {

	private Comon comon;
	
	

	
	public Producer(Comon comon) {
		this.comon = comon;
	}


	@Override
	public void run() {
		while (true) {
			comon.add();
		}
	}
}
