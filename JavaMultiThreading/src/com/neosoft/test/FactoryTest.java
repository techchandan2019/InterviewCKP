package com.neosoft.test;

public class FactoryTest {
	
	public static void main(String[] args) {
		Factory factory=new Factory();
		ProducerThread pth=new ProducerThread(factory);
		ConsumerThread cth=new ConsumerThread(factory);
		Thread th1=new Thread(pth);
		Thread th2=new Thread(cth);
		th1.start();
		th2.start();
	}
}
class ProducerThread implements Runnable{
	private Factory factory;
	ProducerThread(Factory factory){
		this.factory=factory;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			factory.produces(i);
			}
	}
}
class ConsumerThread implements Runnable{
	private Factory factory;
	ConsumerThread(Factory factory){
		this.factory=factory;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
		factory.consumes(i);
		}
	}
}
class Factory{
	
	private int items;
	private boolean itemAvailable;
	public synchronized void produces(int items) {
		if(itemAvailable) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.items=this.items+items;
		System.out.println("produces "+items);
		itemAvailable=true;
		notify();
	}
	public synchronized void consumes(int items) {
		if(!itemAvailable) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.items=this.items-items;
		System.out.println("consumes "+items);
		itemAvailable=false;
		notify();
	}
	
}
