package com.neosoft.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test06 {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		ACls[] arr= {new ACls(1),new ACls(2),new ACls(3),new ACls(4)};
		for(ACls a:arr) {
			ex.submit(a);
		}
	}
}
class ACls extends Thread{
	private int x;
	public ACls(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"="+x);
	}
}
