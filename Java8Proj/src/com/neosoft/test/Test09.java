package com.neosoft.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test09 {
	
	public static void main(String[] args) {
		int[] ia= {1,2,2,3,4,5,5,5};
		List<Integer> li=Arrays.stream(ia).boxed().collect(Collectors.toList());
		Long count=Arrays.stream(ia).filter(p->Collections.frequency(li, p)>1).distinct().count();
		System.out.println(count);
//		System.out.println(Collections.frequency(li, 5));
		
		String s="abc";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
}
