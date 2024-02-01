package com.neosoft.test02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an integer array nums, return the length of the longest strictly increasing 
subsequence
.

 

Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1
 

Constraints:

1 <= nums.length <= 2500
-104 <= nums[i] <= 104*/
public class Test10 {
	
	public static void main(String[] args) {
		int[] a= {10,9,2,5,3,7,101,18};
		int[] a1= {0,1,0,3,2,3};
		int[] a2= {7,7,7,7,7,7,7};
		System.out.println(maxLenthSubsequent(a));
		System.out.println(maxLenthSubsequent(a1));
		System.out.println(maxLenthSubsequent(a2));
	}
	public static int maxLenthSubsequent(int[] a) {
		int[] arr=new int[a.length];
		Arrays.fill(arr, 1);
		
		for(int i=1;i<a.length;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]) 
					max=Math.max(max, arr[j]);
			
			}
			arr[i]=max+1;
			
		}
		 
		return Arrays.stream(arr).max().getAsInt();
	}

}
