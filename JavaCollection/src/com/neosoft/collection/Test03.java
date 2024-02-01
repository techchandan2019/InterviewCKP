package com.neosoft.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test03 {
 
	public static void main(String[] args) throws InterruptedException {
		
		
//		List<Integer> li=new ArrayList<>();
		List<Integer> li=new CopyOnWriteArrayList<>();
//		List<Integer> li=new Vector<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		MyRunnable mr=new MyRunnable(li);
		Thread th1=new Thread(mr);
		th1.start();
		for(Integer i:li) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}
}
class MyRunnable implements Runnable{
	private List<Integer> li;
	
	public MyRunnable(List li) {
		this.li=li;
	}
	@Override
	public void run() {
	
		li.add(5);
	}
}
