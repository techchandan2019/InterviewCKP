package com.neosoft.basic;

public class Test05Array {
	public static void main(String[] args) {
		//get max Integer
		int[] a= {1,2,34,31,20};
		System.out.println("max number "+maxElement(a));
	}
	public static int maxElement(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			/*if(a[i]>max)
				max=a[i];*/
			max=Math.max(max, a[i]);
		}
		return max;
	}
}

