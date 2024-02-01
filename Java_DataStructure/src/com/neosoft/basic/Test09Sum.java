package com.neosoft.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test09Sum {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int key=6;
		System.out.println(Arrays.toString(getSumIndex(a, key)));
		
	}
	public static  int[] getSumIndex(int[] a,int key) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int x=key-a[i];
			if(map.containsKey(x) && map.get(x)!=i) {
				return new int[] {map.get(x),i};
			}
			map.put(a[i], i);
			System.out.println(map);
		}
		return null;
	}
	
	
}
