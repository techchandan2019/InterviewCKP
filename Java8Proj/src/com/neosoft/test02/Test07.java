package com.neosoft.test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.*/
public class Test07 {
	
	public static void main(String[] args) {
		
		int[] a= {-1,0,1,2,-1,-4};
		int[] b= {0,0,0};
		int[] c= {0,1,1};
		
		//after sort {-4,-1,-1,0,1,2}
		System.out.println(getTripleSum(a));
		System.out.println(getTripleSum(b));
		System.out.println(getTripleSum(c));
		
	}
	public static List<List<Integer>> getTripleSum(int []a){
		Arrays.sort(a);
		
		Set<List<Integer>> set=new HashSet<>();
		List<List<Integer>> li=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			int j=i+1;
			int k=a.length-1;
			//use two pointer 
			while(j<k) {
				int sum=a[i]+a[j]+a[k];
				if(sum==0) {
					List<Integer> l=new ArrayList<>();
					l.add(a[i]);
					l.add(a[j]);
					l.add(a[k]);
					
					set.add(l);
					j++;
					k--;
				
				}else if(sum<0) 
					j++;
				else 
					k--;
				
			}
		}
		li.addAll(set);
		
		return li;
	}
}
