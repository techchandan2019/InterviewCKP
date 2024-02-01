package com.neosoft.recurssion;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(powerOfTwo(5));
		System.out.println(factorial(4));
		int[] a= {1,2,3,4,5};
		System.out.println(sum(a,a.length));
//		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 1, a.length)));
		System.out.println(linearSearch(a, a.length,10));
	}
	public static int powerOfTwo(int n) {
		if(n==1)
			return 2;
		return 2*powerOfTwo(n-1);
	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static int sum(int[] a,int size) {
		if(size==0)
			return 0;
		if(size==1)
			return a[0];
		else {
			
			return a[0]+sum(Arrays.copyOfRange(a,1, size),size-1);
		}
	}
	public static boolean linearSearch(int[] a,int size,int key) {
		if(size==0)
			return false;
		if(a[0]==key)
			return true;
		else 
			return linearSearch(Arrays.copyOfRange(a,1, size),size-1,key);

	}
}
