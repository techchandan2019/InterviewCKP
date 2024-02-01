package com.neosoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class TestL2_05 {
	
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(11);
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(21);
		li.add(14);
		li.add(14);
		li.add(52);
		li.add(52);
		
		//even number
		li.stream().filter(p->p%2==0).forEach(p->System.out.print(p+" "));
		System.out.println("==============");
		//starts with 1
		li.stream().map(p->String.valueOf(p)).filter(p->p.startsWith("1")).forEach(p->System.out.print(p+" "));
		System.out.println("==============");
		//find duplicate
		Map<Integer, Long> map1 = li.stream().collect(Collectors.groupingBy(p->p,Collectors.counting()));
		map1.entrySet().stream().filter(p->p.getValue()>1).forEach(p->System.out.print(p.getKey()+" "));
		System.out.println("============");
		//non repeated character in a list
		map1.entrySet().stream().filter(p->p.getValue()==1).forEach(p->System.out.print(p.getKey()+" "));
		System.out.println("============");
		//total number of element in a list
		long count = li.stream().count();
		System.out.println(count);
		System.out.println("============");
		//find max value
		Integer maxVal = li.stream().max((l1,l2)->l1.compareTo(l2)).get();
		System.out.println("max value :"+maxVal);
		System.out.println("============");
	
		//=======================
		Map<Integer, Long> map2 = li.stream().collect(Collectors.groupingBy(p->p,Collectors.counting()));
		Map<Integer, Long> map3 = li.stream().collect(Collectors.groupingBy(p->p,LinkedHashMap::new,Collectors.counting()));
		System.out.println(map2);
		System.out.println(map3);
		
		String join1 = li.stream().map(p->String.valueOf(p)).collect(Collectors.joining());
		String join2 = li.stream().map(p->String.valueOf(p)).collect(Collectors.joining(","));
		String join3 = li.stream().map(p->String.valueOf(p)).collect(Collectors.joining(",","{","}"));
		System.out.println(join1);
		System.out.println(join2);
		System.out.println(join3);
		//=========================
		String[] sa= {"chandan","pkp","jayant"};
		String maxLength = Arrays.stream(sa).reduce((l1,l2)->l1.length()>l2.length()?l1:l2).get();
		System.out.println(maxLength);
		String joinString=Arrays.stream(sa).reduce((l1,l2)->l1+" "+l2).get();
		System.out.println(joinString);
		
		Integer sum = li.stream().reduce(0,(p1,p2)->p1+p2);
		System.out.println(sum);
		Integer sum1 = li.stream().mapToInt(p->p).sum();
		System.out.println(sum1);
		Integer sum2 = li.stream().reduce((p1,p2)->p1+p2).get();
		System.out.println(sum2);
		
		//sort the map by its key
		Map<Integer, Long> map4 = li.stream().collect(Collectors.groupingBy(p->p,()->new LinkedHashMap(),Collectors.counting()));
		System.out.println(map4);
		List<Entry<Integer, Long>> collect1 = map4.entrySet().stream().sorted((l1,l2)->l1.getKey().compareTo(l2.getKey())).collect(Collectors.toList());
		System.out.println(collect1);
		//sort the map by its value
		LinkedHashMap<Object, Object> collect2 = map4.entrySet().stream().sorted((l1,l2)->l1.getValue().compareTo(l2.getValue())).collect(Collectors.toMap(p->p.getKey(),x->x.getValue(),(e1,e2)->e1,()->new LinkedHashMap<Object, Object>()));
		System.out.println(collect2);
		
		
	}

}
