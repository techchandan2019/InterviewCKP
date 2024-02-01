package com.neosoft.comletable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Void> runAsync = CompletableFuture.runAsync(new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
			}
		});
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
		CompletableFuture.runAsync(()-> {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
		},executor);
		runAsync.get();
	}
}
