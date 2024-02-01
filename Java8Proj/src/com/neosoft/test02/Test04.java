package com.neosoft.test02;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

		 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]*/
public class Test04 {
	
	public static void main(String[] args) {
		Integer[] ia= {1,1,1,2,2,3};
		int k=2;
		
		Integer[] ia1= {1};
		int k1=1;
		
		Integer[] ia2={7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
		int k2=4;
		System.out.println(Arrays.toString(getArray(ia,k)));
		System.out.println(Arrays.toString(getArray(ia1,k1)));
		System.out.println(Arrays.toString(getArray(ia2,k2)));
		

	}
	public static int[] getArray(Integer[] ia,int k) {
		Map<Integer, Long> map = Arrays.stream(ia).collect(Collectors.groupingBy(p->p,()->new LinkedHashMap<Integer,Long>(),Collectors.counting()));
		
		LinkedHashMap<Integer, Long> lhm = map.entrySet().stream().sorted((l1,l2)->-l1.getValue().compareTo(l2.getValue())).collect(Collectors.toMap(p->p.getKey(), x->x.getValue(),(e1,e2)->e2,()->new LinkedHashMap<Integer,Long>()));
		
		Object[] array = lhm.entrySet().stream().map(p->p.getKey()).collect(Collectors.toList()).toArray();

		int[] a=new int[k];
		
		for(int i=0;i<k;i++) {
			a[i]=(int) array[i];
		}
		return a;
	}

}
