package com.bonami.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Test02AsyncMethods {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		CompletableFuture<List<Integer>> list = CompletableFuture.supplyAsync(()->{
			List<Integer> li=new ArrayList<>();
			
			for(int i=0;i<=10;i++) {
				li.add(i);
			}
			return li;
		}).thenApply(p->p.stream().filter(x->x%2==0).collect(Collectors.toList()));
		
		System.out.println(list.get());
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		CompletableFuture<Void> list2 = CompletableFuture.supplyAsync(()->{
			List<Integer> li=new ArrayList<>();
			System.out.println(Thread.currentThread().getName()+"===========");
			for(int i=0;i<=10;i++) {
				li.add(i);
			}
			return li;
		},service).thenApplyAsync(p->p.stream().filter(x->x%2==0).collect(Collectors.toList()),service)
				.thenAcceptAsync(p->System.out.println(Thread.currentThread().getName()+"-----------"+p),service);
		
		list2.get();
	}
}
