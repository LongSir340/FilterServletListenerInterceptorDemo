package com.demo.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

	private Object obj;

	public MyInvocationHandler(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {

		prePowerOff();

		arg1.invoke(obj, arg2);

		afterPowerOff();

		return null;
	}

	public void prePowerOff() {
		System.out.println("before power off");
	}

	public void afterPowerOff() {
		System.out.println("after power off");
	}

	public static void main(String[] args) {
		// Operate pcPoweroff = new PCPowerOff();
		// InvocationHandler invocationHandler = new
		// MyInvocationHandler(pcPoweroff);
		// Class clazz = pcPoweroff.getClass();
		//
		// Operate proxy =
		// (Operate)Proxy.newProxyInstance(clazz.getClassLoader(),
		// clazz.getInterfaces(), invocationHandler);
		// proxy.poweroff();

		Operate pcPoweroff = new PCPowerOff();
		InvocationHandler invocationHandler = new MyInvocationHandler(pcPoweroff);
		Operate operate = (Operate)Proxy.newProxyInstance(pcPoweroff.getClass().getClassLoader(),pcPoweroff.getClass().getInterfaces(), invocationHandler);
		operate.poweroff();
		operate.add(1, 3);
	}
}
