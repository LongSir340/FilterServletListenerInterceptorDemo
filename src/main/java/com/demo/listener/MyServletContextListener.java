package com.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("=============MyServletContextListener初始化========================");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("=============MyServletContextListener销毁========================");
	}
}
