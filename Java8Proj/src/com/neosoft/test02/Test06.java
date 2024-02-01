package com.neosoft.test02;

import java.util.Arrays;

/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. */
public class Test06 {
	
	public static void main(String[] args) {
		Integer []a1= {3,4,5,1,2};
		Integer []a2= {4,5,6,7,0,1,2};
		Integer []a3= {11,13,15,17};
		//approch-1
		System.out.println(getMinValue(a1));
		System.out.println(getMinValue(a2));
		System.out.println(getMinValue(a3));
		
		//approch-2
		System.out.println(getMin(a1));
		System.out.println(getMin(a2));
		System.out.println(getMin(a3));
		
		
		
	}
	//approch-1
	public static int getMinValue(Integer[] a) {
		Integer minValue = Arrays.stream(a).min((l1,l2)->l1.compareTo(l2)).get();
		return minValue;
	}
	//approch-2
	public static int getMin(Integer[] a) {
		int s=0;
		int e=a.length-1;
		int mid=s+(e-s)/2;
		while(s<e) {
			if(a[mid]>a[e])
				s=mid+1;
			else
				e=mid;
			
			mid=s+(e-s)/2;
		}
		return a[s];
	}

}
