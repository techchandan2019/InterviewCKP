package com.neosoft.test;

public class PrintEvenOddConcurrent {
	public static void main(String[] args) {
		EvenOdd1 evenOdd=new EvenOdd1();
		PrintEvenThread peth=new PrintEvenThread(evenOdd);
		PrintOddThread poth=new PrintOddThread(evenOdd);
		Thread th1=new Thread(peth);
		Thread th2=new Thread(poth);
		th1.start();
		th2.start();
	}

}
class PrintEvenThread implements Runnable{
	private EvenOdd1 evenOdd;
	public PrintEvenThread(EvenOdd1 evenOdd) {
		this.evenOdd=evenOdd;
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2==0)
			evenOdd.printEven(i);
		}
	}
}
class PrintOddThread implements Runnable{
	private EvenOdd1 evenOdd;
	public PrintOddThread(EvenOdd1 evenOdd) {
		this.evenOdd=evenOdd;
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2!=0)
			evenOdd.printOdd(i);
		}
	}
}
class EvenOdd1{
	private boolean isThreadOne;
	public synchronized void printEven(int i) {
		if(isThreadOne) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" - "+i);
		isThreadOne=true;
		notify();
	
	}
	public synchronized void printOdd(int i) {
		if(!isThreadOne) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" - "+i);
		isThreadOne=false;
		notify();
	
	}
	
}
