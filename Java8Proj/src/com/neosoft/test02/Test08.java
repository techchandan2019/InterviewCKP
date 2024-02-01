package com.neosoft.test02;

/*Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count*/

public class Test08 {
	
	public static void main(String[] args) {
		int[] a= {2, 4, 1, 3, 5};
		System.out.println(getInversionCount(a));
		
		int[] a1= {2, 3, 4, 5, 6};
		System.out.println(getInversionCount(a1));
		
		int[] a2={10, 10, 10};
		System.out.println(getInversionCount(a2));
		
	}

	public static int getInversionCount(int[] a) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
					c++;
			}
		}
		return c;
	}
	
}
