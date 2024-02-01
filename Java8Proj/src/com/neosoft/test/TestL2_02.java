package com.neosoft.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestL2_02 {

	public static void main(String[] args) {
		List<Integer> li1=Arrays.asList(10,20,30);
		List<Integer> li2=Arrays.asList(11,22,33);
		List<Integer> li3=Arrays.asList(21,22,23);
		List<Integer> li4=Arrays.asList(123,30,12);
		List<List<Integer>> li5=Arrays.asList(li1,li2,li3,li4);
		System.out.println(li5);
		List<Integer> li6 = li5.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		System.out.println(li6);
		
		String s="chandan";
		s=s.substring(0,s.length()-1);
		System.out.println(s);
		int sum=0;
		for(int i=0;i<=2;i++) {
			sum=sum+fib(i);
		}
		System.out.println(sum);
		
		
	}
	public static int fib(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
}
