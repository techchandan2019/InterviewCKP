package com.neosoft.basic;

import java.util.Arrays;

public class Test11Rotated {
	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5};
		int k=2;
		int []b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[(i+k)%a.length]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
