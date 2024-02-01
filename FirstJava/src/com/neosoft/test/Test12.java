package com.neosoft.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test12 {

	public static void main(String[] args) {
		
		//Print duplicate character in String
		String s="chandan";
		String[] sa=s.split("");
		Map<String,Long> map=Arrays.stream(sa).collect(Collectors.groupingBy(p->p,Collectors.counting()));
		map.entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).forEach(p->System.out.print(p));
		
		System.out.println();
		System.out.println("=============");
		
		//find the first non repeated character in String
		String s1=map.entrySet().stream().filter(p->p.getValue()==1).findFirst().get().getKey();
		System.out.println(s1);
		
		//find the String contains only digit or not
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				flag=true;
				break;
			}
		}
		System.out.println(flag?"contains number":" not contains number");
		
		//check two String is anagrams or not
		String s2="listen";
		String s3="silent";
		
		String[] sa2=s2.split("");
		String[] sa3=s3.split("");
		List<String> li2=Arrays.stream(sa2).sorted().collect(Collectors.toList());
		List<String> li3=Arrays.stream(sa3).sorted().collect(Collectors.toList());
		System.out.println(li2.equals(li3));
		
		//find the number vowel in the String
		String s4="chandan";
		List<String> li4=Arrays.asList("a","e","i","o","u");
		
		String[] sa4=s4.split("");
		List<String> li44=Arrays.stream(sa4).filter(p->li4.contains(p)).collect(Collectors.toList());
		System.out.println(li44);
		
		//reverse the each character in String Array
		String[] sa5= {"abc","bbc"};
		Arrays.stream(sa5).map(p->new StringBuilder(p).reverse()).forEach(p->System.out.println(p));
		
		//sumation of 2 Array
		int[] ia1= {1,2,3};
		int[] ia2= {2,3,4};
		int [] ia3=new int[3];
		Arrays.setAll(ia3,i->ia1[i]+ia2[i]);
		System.out.println(Arrays.toString(ia3));
	}
}
