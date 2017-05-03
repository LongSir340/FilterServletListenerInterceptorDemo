package com.demo.thread;

public class Comon {
	
	private int i = 0;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void add(){
		i+=1;
		System.out.println(i);
	}
}
