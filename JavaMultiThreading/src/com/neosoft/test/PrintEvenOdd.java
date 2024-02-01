package com.neosoft.test;

public class PrintEvenOdd {
	public static void main(String[] args) {
		EvenOdd evenOdd=new EvenOdd();
		Print print=new Print(evenOdd);
		Thread th1=new Thread(print);
		Thread th2=new Thread(print);
		th1.start();
		th2.start();
	}

}
class Print implements Runnable{
	private EvenOdd evenOdd;
	public Print(EvenOdd evenOdd) {
		this.evenOdd=evenOdd;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			evenOdd.printEvenOdd(i);
		}
	}
}
class EvenOdd{
	public void printEvenOdd(int i) {
		String thName=Thread.currentThread().getName();
		if(thName.equalsIgnoreCase("Thread-0") && i%2==0)
			System.out.println(Thread.currentThread().getName()+" "+i);
		else if(thName.equalsIgnoreCase("Thread-1") && i%2!=0)
			System.out.println(Thread.currentThread().getName()+" "+i);
	}
	
}
