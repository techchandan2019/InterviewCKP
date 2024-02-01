package com.neosoft.test;

public class Test03 {

	public static void main(String[] args) {
		MyThread mt1=new MyThread(10,"Th-1");
		MyThread mt2=new MyThread(5,"Th2");
		mt1.start();
		mt2.start();
	}
}
class MyThread extends Thread{
	private int end;
	public MyThread(int end,String name) {
		super(name);
		this.end=end;
	}
	@Override
	public void run() {
		for(int i=0;i<end;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}
