package com.neosoft.test;

public class Test01 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		A th1=new A();
		th1.start();
//		Thread.sleep(1000);
		th1.join();
		System.out.println("Main method end");
		
	}
}

class A extends Thread{
	@Override
	public void run() {
		System.out.println("A class start");
		System.out.println(Thread.currentThread().getName());
	}
}
