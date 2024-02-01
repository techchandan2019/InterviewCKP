package com.neosoft.basic;

import java.util.Arrays;

public class Test14InsertionSort {

	public static void main(String[] args) {
		int []a= {4,1,10,3,2};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(insertionSort(a)));
		

	}
	public static int[] insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			for(;j>=0;j--) {
				if(a[j]>temp)
					a[j+1]=a[j];
				else
					break;
			}
			a[j+1]=temp;
			System.out.println(Arrays.toString(a));
		}
		return a;
		
	} 
	
	
}
