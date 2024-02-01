package com.neosoft.basic;

public class Test07BinarySearch {
	public static void main(String[] args) {
		int[] ia= {1,2,3,4,5,6};
		int key=6;
		System.out.println(searchIndex(ia, key));
		
	}
	public static int searchIndex(int[] ia,int key) {
		int s=0;
		int e=ia.length-1;
		int mid=(s+e)/2;
		while(s<=e) {
			if(key==ia[mid]) 
				return mid;
			else if(key>ia[mid])
				s=mid+1;
			else if(key<ia[mid])
				e=mid-1;
			
			mid=s+((e-s)/2);
		}
		return -1;
	}
}
