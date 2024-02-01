package com.neosoft.test;

public class PrintEvenOddConcurrent2 {
	public static void main(String[] args) {
		PrintEvenThread12 evenOdd=new PrintEvenThread12();

		Thread th1=new Thread(evenOdd);
		th1.setName("even");
		Thread th2=new Thread(evenOdd);
		th2.setName("odd");
		th1.start();
		th2.start();
	}

}
class PrintEvenThread12 implements Runnable{
	int count=0;
	@Override
	public void run() {
		while(count<=10) {
			if(count%2==0 && Thread.currentThread().getName().equals("even")) {
				synchronized(this) {
				System.out.println("Even Thread :"+count);
				count++;
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
			if(count%2!=0 && Thread.currentThread().getName().equals("odd")) {
				synchronized(this) {
					System.out.println("Odd Thread :"+count);
					count++;
					notify();
					}
			}
		}
	}
}
