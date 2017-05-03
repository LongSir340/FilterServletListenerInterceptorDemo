package com.demo.thread;

import java.io.IOException;
import java.net.ServerSocket;

public class ThreadTest {
	public static void main(String[] args) throws IOException {
		Comon comon = new Comon();
		Producer producer = new Producer(comon);
		Consumer consumer = new Consumer(comon);
		
		producer.start();
		consumer.start();
		
		ServerSocket serverSocket = new ServerSocket(8888);
		serverSocket.accept();
	}
}
