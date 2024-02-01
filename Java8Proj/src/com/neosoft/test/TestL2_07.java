package com.neosoft.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestL2_07 {
	public static void main(String[] args) {
	
		String s="ilovejavatechnical";
		String[] sa=s.split("");
		Map<String, Long> map1 = Arrays.stream(sa).collect(Collectors.groupingBy(p->p,Collectors.counting()));
		System.out.println(map1);
		
		//only dupplicate elements
		List<String>  duplicateChar= map1.entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).collect(Collectors.toList());
		System.out.println(duplicateChar);
		//sort by key
	 List<Entry<String, Long>> map2SortedByKey = map1.entrySet().stream().sorted((l1,l2)->l1.getKey().compareTo(l2.getKey())).collect(Collectors.toList());
		System.out.println(map2SortedByKey);
		//or
		LinkedHashMap<String, Long> map2SortedByKey2=map1.entrySet().stream().collect(Collectors.toMap(p1->p1.getKey(),e->e.getValue(),(e1,e2)->e1,()->new LinkedHashMap<String, Long>()));
		System.out.println(map2SortedByKey2);
		
		LinkedHashMap<String, Long> map2SortedByValue = map1.entrySet().stream().sorted((l1,l2)->l1.getValue().compareTo(l2.getValue())).collect(Collectors.toMap(p1->p1.getKey(),e->e.getValue(),(e1,e2)->e1,()->new LinkedHashMap<String, Long>()));
		System.out.println(map2SortedByValue);
		
		//==============
		//find all element in a same order
		LinkedHashMap<String, Long> map3SameOrder = Arrays.stream(sa).collect(Collectors.groupingBy(p->p,()->new LinkedHashMap<String,Long>(),Collectors.counting()));
		System.out.println(map3SameOrder);
		//find first non repeated element
		String ss1 = map3SameOrder.entrySet().stream().filter(p->p.getValue()==1).findFirst().get().getKey();
		System.out.println(ss1);
		
		//===========
		//find 2nd highest number in a array
		Integer ia[]= {5,9,11,2,8,21,1};
		Integer i1 = Arrays.stream(ia).sorted((l1,l2)->-l1.compareTo(l2)).skip(1).findFirst().get();
		System.out.println(i1);
		
		/*StringJoiner sj=new StringJoiner(" ");
		String[] sa= {"abc","bba","ccs"};
		System.out.println(String.join(" ", sa));*/
		
	}
}
