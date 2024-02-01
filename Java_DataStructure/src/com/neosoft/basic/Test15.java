package com.neosoft.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test15 {

	public static void main(String[] args) {
		/*	sort array based on the max occurance of element in desc
			I/p: 1, 4, 5, 2, 5, 1, 2, 5
			O/p: 5, 5, 5, 1, 1, 2, 2, 4*/
		
		Integer[] a= {1, 4, 5, 2, 5, 1, 2, 5};
		Map<Integer, Long> map = Arrays.stream(a).collect(Collectors.groupingBy(p->p,() -> new LinkedHashMap<Integer,Long>(),Collectors.counting()));
		System.out.println(map);
		
		LinkedHashMap<Integer, Long> map1 = map.entrySet().stream().sorted((l1,l2)->-l1.getValue().compareTo(l2.getValue())).collect(Collectors.toMap(p->p.getKey(), x->x.getValue(),(t, u) ->t,() -> new LinkedHashMap<Integer,Long>() ));
		System.out.println(map1);
		Set<Entry<Integer, Long>> entrySet = map1.entrySet();
		int[] arr=new int[a.length];
		int k=0;
		for(Entry<Integer, Long> es:entrySet) {
			for(int i=0;i<es.getValue();i++) {
				arr[k++]=es.getKey();
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		//==============
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "a");
		System.out.println(m.getOrDefault(1, "abc"));
		//==================
		System.out.println("============");
		String s="abc";

		System.out.println(reverse(s));
		
		//===============
		System.out.println("============reverse list");
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		for(int i=0;i<li.size();i++) {
			li.add(i, li.remove(li.size()-1));
		}
		System.out.println(li);
		
		//rotate the list
		System.out.println("=======rotate the list");
		List<Integer> li2=new ArrayList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(4);
		System.out.println(li2);
		for(int i=0;i<2;i++) {
			Integer temp=li2.remove(li2.size()-1);
			li2.add(0, temp);
		}
		System.out.println(li2);
		StringBuilder sb=new StringBuilder("abcdef");
		sb.delete(1, 2);
		sb.deleteCharAt(1);
		
		System.out.println(sb);
		
	}
	public static String reverse(String s) {
		if(s.length()==0) 
			return "";
	
		else 
			return reverse(s.substring(1))+s.charAt(0);
			
	
	}
}
