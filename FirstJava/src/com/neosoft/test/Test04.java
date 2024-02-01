package com.neosoft.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test04 {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,1,2,3,4,5);
		
		Map<Integer,Long> map=li.stream().collect(Collectors.groupingBy(p->p,Collectors.counting()));
		System.out.println(map);
		
		//====================
		String s="chandan";
		String[] sa=s.split("");
//		Map<String,List<String>> map1=Arrays.stream(sa).collect(Collectors.groupingBy(p->p));
		Map<String,Long> map1=Arrays.stream(sa).collect(Collectors.groupingBy(p->p,Collectors.counting()));
		System.out.println(map1);
		
		map1.entrySet().stream().filter(p->p.getValue()>1).forEach(p->System.out.print(p+" "));
		System.out.println("=============");
		map1.entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).forEach(p->System.out.print(p+" "));
		System.out.println("=============");
//        String s1=map1.entrySet().stream().filter(p->p.getValue()==1).findFirst();
		
		/*List<Integer> li1=Arrays.asList(10,20,30);
		List<Integer> li2=Arrays.asList(11,22,33);
		List<Integer> li3=Arrays.asList(21,22,23);
		List<Integer> li4=Arrays.asList(123,30,12);
		List<List<Integer>> li5=Arrays.asList(li1,li2,li3,li4);
		System.out.println(li5);
		List<Integer> li6=li5.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		System.out.println(li6);*/
		
		
		//remove the duplicate from Array
		Integer [] a= {1,2,1,1,3,4,2};
		List<Integer> li7=Arrays.stream(a).distinct().collect(Collectors.toList());
		System.out.println(li7);
		
        List<Integer> li8=Arrays.stream(a).collect(Collectors.toList());
		System.out.println(li8);
		List<Integer> li9=Arrays.stream(a).filter(p->Collections.frequency(li8, p)>=1).distinct().collect(Collectors.toList());
		System.out.println(li9);
		
		
		
		
		
		
		
		
		
	}
}
