package com.bonami.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01CompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//run as async method
		ExecutorService service=Executors.newFixedThreadPool(3);
		CompletableFuture<Void> runAsync = CompletableFuture.runAsync(()->{
			for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			}
			},service);
		CompletableFuture<Void> runAsync1 = CompletableFuture.runAsync(()->{
			for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			}
			},service);
		
		runAsync.get();
		runAsync1.get();
		//supplyAsAsync method
		CompletableFuture<List<Integer>> supplyAsync1 = CompletableFuture.supplyAsync(()->{
			List<Integer> li=new ArrayList<>();
			for(int i=0;i<10;i++) {
			li.add(i);
			}
			return li;
			},service);
		
		System.out.println(supplyAsync1.get());
		
		
		
		}
}
