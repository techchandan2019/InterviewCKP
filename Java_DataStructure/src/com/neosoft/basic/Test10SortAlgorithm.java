package com.neosoft.basic;

import java.util.Arrays;

public class Test10SortAlgorithm {
	
	public static void main(String[] args) {
		int[] a= {6,4,1,5,3};
		System.out.println("===selection sort=======");
		System.out.println(Arrays.toString(selectionSort(a)));
		System.out.println("=====Bubble sort====");
		System.out.println(Arrays.toString(bubbleSort(a)));
	}
	public static int[] selectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
				
					min=j;
					//swap
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
				}
				
			}
			
			
		}
		return a;
	}
	public static int[] bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					//swap=======
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
}
