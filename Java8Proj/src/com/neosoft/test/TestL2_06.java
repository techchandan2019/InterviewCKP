package com.neosoft.test;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.ToIntFunction;

public class TestL2_06 {
	
	public static void main(String[] args) {
		String s="12345";
		String[] sa=s.split("");
	    int sum=Arrays.stream(sa).mapToInt(p->Integer.parseInt(p)).filter(p->p%2!=0).sum();
	     System.out.println(sum);
	     
	      int sumTotal = Arrays.stream(sa).mapToInt(p->Integer.parseInt(p)).reduce((p1,p2)->p1+p2).getAsInt();
	      System.out.println(sumTotal);
	      
	      
	}
}
