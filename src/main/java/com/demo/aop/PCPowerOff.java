package com.demo.aop;

public class PCPowerOff implements Operate {

	@Override
	public void poweroff() {
		System.out.println("the pc is power off");
	}

	@Override
	public void add(int x, int y) {
		System.out.println("add result is:" + (x + y));
	}

}
