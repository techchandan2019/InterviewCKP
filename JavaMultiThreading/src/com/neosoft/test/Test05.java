package com.neosoft.test;

public class Test05 {

	public static void main(String[] args) {
		Addition add=new Addition();
		AddThread th1=new AddThread(add, 10, 20);
		AddThread th2=new AddThread(add, 20, 30);
		th1.start();
		th2.start();
	}
}
class Addition{
	private int x;
	private int y;
	public  void addition(int x,int y) throws InterruptedException {
		synchronized (this) {
			this.x=x;
			Thread.sleep(1000);
			this.y=y;
			System.out.println(this.x+this.y);
		}
		
		
		
	}
}
class AddThread extends Thread{
	private Addition add;
	private int x;
	private int y;
	public AddThread(Addition add,int x,int y) {
		this.add=add;
		this.x=x;
		this.y=y;
	}
	@Override
	public void run() {
		try {
			add.addition(x,y);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
