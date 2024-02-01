package com.neosoft.test;

public class Test03 {

	public static void main(String[] args) {
	PrintNumber number=new PrintNumber();
	EvenThread r1=new EvenThread(number);
	OddThread r2=new OddThread(number);
	
	Thread th1=new Thread(r1);
	Thread th2=new Thread(r2);
	
	th1.start();
	th2.start();
		
	}
}
class EvenThread implements Runnable{
	private PrintNumber print;
	EvenThread(PrintNumber print){
		this.print=print;
	}
	@Override
	public void run() {
		print.evenNumber();
		}
}
class OddThread implements Runnable{
	private PrintNumber print;
	OddThread(PrintNumber print){
		this.print=print;
	}
	@Override
	public void run() {
		print.oddNumber();
		}
		
}
class PrintNumber{
	private boolean flag;
	public synchronized void evenNumber() {
		if(!flag) {
			for(int i=0;i<10;i++) {
				if(i%2==0) 
					System.out.println(Thread.currentThread().getName()+" ==>"+i);
				flag=true;
				notify();
		
			}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			

		}
		
		
	}
	public synchronized void oddNumber() {
		if(flag) {
			for(int i=0;i<10;i++) {
				if(i%2!=0) 
					System.out.println(Thread.currentThread().getName()+" ==>"+i);

				flag=false;
				notify();
				
			}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			

		}
		
		
	}
	
}
