package com.neosoft.test;

public class Test04 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		MyThread1 th1=new MyThread1();
		MyThread1 th2=new MyThread1();
		th1.start();
		
//		th1.yield();
//		th1.sleep(1000);
//		th1.join();
		th2.start();
		
		System.out.println(th1);
		
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String name=Thread.currentThread().getName();
		if(name.equals("Thread-0"))
			printEven();
		else
			printOdd();
	}
	public void printEven() {
		for(int i=0;i<5;i++) {
			if(i%2==0)
				System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	public void printOdd() {
		for(int i=0;i<5;i++) {
			if(i%2!=0)
				System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	
}
