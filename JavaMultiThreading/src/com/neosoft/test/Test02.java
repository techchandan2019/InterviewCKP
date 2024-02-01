package com.neosoft.test;

//public class Test02 extends Thread {
public class Test02 extends Thread implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("main start"+Thread.currentThread().getName());
		Test02 t1=new Test02();
		t1.start();
		Thread th1=new Thread(t1);
		th1.start();
		System.out.println("main end"+Thread.currentThread().getName());
	}
	
}
