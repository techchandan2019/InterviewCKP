package com.neosoft.recurssion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {1,112,3,4,20};
		sort(a,a.length);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a,int size) {
		if(size==0 || size==1)
			return ;
		
		for(int i=0;i<size-1;i++) {
			if(a[i]>a[i+1]) {
				//swap
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		sort(Arrays.copyOfRange(a,0, size-1),size-1);
	}
}

