package com.neosoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestL2_01 {
	public static void main(String[] args) {
		
		String s="I Love Java";
		String[] sa=s.split("");
		
		Map<String, List<String>> map1 = Arrays.stream(sa).collect(Collectors.groupingBy(p->p));
		System.out.println(map1);
		List<String> li1 = Arrays.stream(sa).filter(p->!p.contains(" ")).collect(Collectors.toList());
		System.out.println(li1);
		Map<String, Long> map2 = li1.stream().collect(Collectors.groupingBy(p->p,Collectors.counting()));
		System.out.println(map2);
		
		//printing duplicate elements
		List<Entry<String, Long>> li2 = map2.entrySet().stream().filter(p->p.getValue()>1).collect(Collectors.toList());
		System.out.println(li2);
		
		//unique element
		List<Entry<String, Long>> li3 = map2.entrySet().stream().filter(p->p.getValue()==1).collect(Collectors.toList());
		System.out.println(li3);
		//find first non repeated character
		String key = map2.entrySet().stream().filter(p->p.getValue()==1).findFirst().get().getKey();
		System.out.println(key);
		
		Integer[] ia= {19,2,3,22,3,33};
		List<Integer> ia1 = Arrays.stream(ia).sorted().collect(Collectors.toList());
		System.out.println(ia1);
		List<Integer> ia2 = Arrays.stream(ia).sorted((l1,l2)->l1.compareTo(l2)).collect(Collectors.toList());
		System.out.println(ia2);
		List<Integer> ia3 = Arrays.stream(ia).sorted((l1,l2)->-l1.compareTo(l2)).collect(Collectors.toList());
		System.out.println(ia3);
		
		//find 2nd max element
		Integer ia4= Arrays.stream(ia).sorted((l1,l2)->-l1.compareTo(l2)).skip(1).findFirst().get();
		System.out.println(ia4);
		
		String[] sa9= {"java","Spring","SpringBoot","Microservices"};
		
		 String maxString= Arrays.stream(sa9).max((l1,l2)->l1.length()-l2.length()).get();
		 System.out.println(maxString);
		 
		 int[] ia5= {1,2,2,3,4,5,5,5};
		 
		 List<Integer> li4=Arrays.stream(ia5).boxed().collect(Collectors.toList());
		 List<Integer> li5 = li4.stream().filter(p->Collections.frequency(li4, p)>1).distinct().collect(Collectors.toList());
		 System.out.println(li5);
		 
		 String ss="Hello@How are you?";
		 ss=ss.toLowerCase();
		 List<String> lis=new ArrayList<>();
		 for(int i=0;i<ss.length();i++) {
			 if(ss.charAt(i)>='a' && ss.charAt(i)<='z') {
				 lis.add(String.valueOf(ss.charAt(i)));
			 }
		 }
		 System.out.println(lis);
		 
		 
		 //rotate the list by 3 times
		 List<Integer> li=new ArrayList<>();
		 li.add(1);
		 li.add(2);
		 li.add(3);
		 li.add(4);
		 li.add(5);
		 System.out.println(li);
		 for(int i=0;i<3;i++) {
			 int ele=li.remove(0);
			 li.add(ele);
		 }
		 System.out.println(li);
		 
		 
		 //reverse all the String in a list
		 String[] ssa= {"abc","bbc","cdf"};
		 List<String> ssaList = Arrays.stream(ssa).map(p->new StringBuilder(p).reverse().toString()).collect(Collectors.toList());
		 System.out.println(ssaList);
		 
		 
		 //reverse a list without using another list
		 List<Integer> li6=new ArrayList<>();
		 li6.add(1);
		 li6.add(2);
		 li6.add(3);
		 li6.add(4);
		 li6.add(5);
			/*		 for(int i=0;i<li6.size();i++) {
						 li6.add(i, li6.remove(li6.size()-1));
					 }
					 System.out.println(li6);*/
		 System.out.println(li6);
		 int len=li6.size();
		 for(int i=0;i<len/2;i++) {
			 int last=li6.remove(len-i-1);
			 int first=li6.remove(i);
			 li6.add(i, last);
			 li6.add(len-i-1, first);
			
		 }
		 System.out.println(li6);
		 
		 //===============
		 //reverse array
		 int[] ia11= {1,2,3,4,5};
		 System.out.println(Arrays.toString(ia11));
		 int len2=ia11.length;
		 for(int i=0;i<len2/2;i++) {
			 int temp=ia11[i];
			 ia11[i]=ia11[len2-i-1];
			 ia11[len2-i-1]=temp;
		 }
		 System.out.println(Arrays.toString(ia11));
		 
		 //===================
		 //String a reverse
		 String s11="madam";
		 int len3=s11.length();
		 boolean flag=false;
		 for(int i=0;i<len3/2;i++) {
			 if(s11.charAt(i)==s11.charAt(len3-i-1))
				 flag=true;
			 else {
				 flag=false;
				 break;
			 }
		 }
		 System.out.println(flag?"Pallindrome":"not a pallindrome");
		 
		 
		//=============
		 //rotate the array by 3 times
		 
		 int[] a= {1,2,3,4,5};
		 int n1=3;
		 for(int i=0;i<n1;i++) {
			 int tmp=a[0];
			 for(int j=0;j<a.length-1;j++) {
				 a[j]=a[j+1];
			 }
			 a[a.length-1]=tmp;
			 
		 }
		 System.out.println(Arrays.toString(a)+" ======");
	}

}
