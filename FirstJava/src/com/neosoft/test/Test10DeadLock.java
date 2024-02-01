package com.neosoft.test;

public class Test10DeadLock {

	public static void main(String[] args) {
		DeadThread dt=new DeadThread();
		dt.m2();
	}
}
class DeadThread extends Thread{
	A a=new A();
	B b=new B();
	public void  m2() {
		this.start();
		a.m1(b);
	}
	@Override
	public void run() {
		b.m1(a);
	}
}
class A{
	public synchronized void  m1(B b) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.last();
	}
	public synchronized void last() {
		System.out.println("A last Method");
	}
}
class B{
	public synchronized void m1(A a) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.last();
	}
	public synchronized void last() {
		System.out.println("B last Method");
	}
}
