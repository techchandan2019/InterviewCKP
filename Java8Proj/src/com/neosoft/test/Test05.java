package com.neosoft.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Test05 {
	public static void main(String[] args) {
		String s="ilovejava";
		String[] sa=s.split("");
		
		Map<String,List<String>> map1=Arrays.stream(sa).collect(Collectors.groupingBy(p->p));
		System.out.println(map1);
		
		Map<String,Long> map2=Arrays.stream(sa).collect(Collectors.groupingBy(p->p,Collectors.counting()));
		System.out.println(map2);
		//duplicate elements
		List<Map.Entry<String, Long>> li3=map2.entrySet().stream().filter(p->p.getValue()>1).collect(Collectors.toList());
		System.out.println(li3);
		//unique elements 
		List<Map.Entry<String, Long>> li4=map2.entrySet().stream().filter(p->p.getValue()==1).collect(Collectors.toList());
		System.out.println(li4);
		//find first non repeated elements
		String s5=map2.entrySet().stream().filter(p->p.getValue()==1).findFirst().get().getKey();
		System.out.println(s5);
		
		//sort the Array by ascending
		Integer[] ia= {19,2,3,22,3,33};
		List<Integer> li6=Arrays.stream(ia).sorted((l1,l2)->l1.compareTo(l2)).collect(Collectors.toList());
		System.out.println(li6);
		
		//sort the Array by descending
		List<Integer> li7=Arrays.stream(ia).sorted((l1,l2)->-l1.compareTo(l2)).collect(Collectors.toList());
		System.out.println(li7);

		//skip the first element and find first
		Integer i8=Arrays.stream(ia).sorted((l1,l2)->-l1.compareTo(l2)).skip(1).findFirst().get();
		System.out.println(i8);
		
		//find longest String in the Array
		String[] sa9= {"java","Spring","SpringBoot","Microservices"};
		String len9=Arrays.stream(sa9).max((l1,l2)->l1.length()-l2.length()).get();
		System.out.println(len9);
		
		//or
		String len10=Arrays.stream(sa9).reduce((word1,word2)->(word1.length()>word2.length())?word1:word2).get();
		System.out.println(len10);
		
		//find the element which starts with 1
		Integer[] ia11= {1,23,12,22,11,15};
		List<String> li11=Arrays.stream(ia11).map(p->String.valueOf(p)).filter(p->p.startsWith("1")).collect(Collectors.toList());
		System.out.println(li11);
		List<Integer> li12=Arrays.stream(ia11).map(p->String.valueOf(p)).filter(p->p.startsWith("1")).map(p->Integer.parseInt(p)).collect(Collectors.toList());
		System.out.println(li12);
		
		StringJoiner joiner=new StringJoiner(",","[","]");
		joiner.add("a");
		joiner.add("abc");
		joiner.add("sda");
		joiner.add("asd");
		System.out.println(joiner);
	
		
		
		
		
	}

}
