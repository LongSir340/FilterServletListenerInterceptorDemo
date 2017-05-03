package com.demo.thread;

public class Consumer extends Thread {
	
	private Comon comon;

	
	public Consumer(Comon comon) {
		this.comon = comon;
	}


	@Override
	public void run() {
		while(true){
			System.out.println(comon.getI());
		}
	}

}
