package com.neosoft.test02;

/*Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/
public class Test05 {
	
	public static void main(String[] args) {
		int []a= {2,3,-2,4};
		int[] a1= {-2,0,-1};
		System.out.println(getResult(a));
		System.out.println(getResult(a1));
	}
	public static int getResult(int []a) {
		int len=a.length;
		int max=Integer.MIN_VALUE;
		int l=1;
		int r=1;
		for(int i=0;i<len;i++) {
			l=l*a[i];
			r=r*a[len-i-1];
			
			max=Math.max(max,Math.max(l, r));
			
			if(l==0)
				l=1;
			if(r==0)
				r=1;
		}
		return max;
	}
}
