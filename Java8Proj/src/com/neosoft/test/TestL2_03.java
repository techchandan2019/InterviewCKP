package com.neosoft.test;

import java.util.Arrays;

public class TestL2_03 {
	
	public static void main(String[] args) {
		String[] sa= {"1","2","3","4","5"};
		int sum = Arrays.stream(sa).mapToInt(p->Integer.parseInt(p)).sum();
		System.out.println(sum);
		Integer sum2 = Arrays.stream(sa).map(p->Integer.parseInt(p)).reduce(0,(a,b)->a+b);
		System.out.println(sum2);
	}
}
