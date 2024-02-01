package com.neosoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		/*String s="hi how are you";
		List<String> li=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				li.add(String.valueOf(s.charAt(i)));
		}
		System.out.println(li);
		Map<String,Long> map=li.stream().collect(Collectors.groupingBy(p->p,Collectors.counting()));
		System.out.println(map);
		
		int i=10;
		Integer  i1=Integer.valueOf(i);
		System.out.println(i1);
		
		Integer I1=10;
		int i2=I1.intValue();
		System.out.println(i2);
		*/
	/*	List<Integer> li2=new ArrayList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(4);
		li2.add(5);
		li2.add(6);
		System.out.println(li2);
		int n=3;
		int len=li2.size();
		//rotate the list by n
		for(int j=0;j<n;j++) {
			int ele=li2.remove(0);
			li2.add(ele);
		}
		System.out.println(li2);
*/
		//=========================
		/*List<Integer> li3=new ArrayList<>();
		li3.add(1);
		li3.add(2);
		li3.add(3);
		li3.add(4);
		li3.add(5);
		li3.add(6);
		System.out.println(li3);
		//reverse the list
		for(int j=0;j<li3.size();j++) {
		
			li3.add(j,li3.remove(li3.size()-1));
		}
		System.out.println(li3);
		*/
	/*	int []a= {10,20,30,40};
		System.out.println(Arrays.toString(a));
		int len1=a.length;
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[len1-1-i];
			a[len1-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));*/
		
	/*	String s="madam";
		int len2=s.length();
		boolean flag=true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)==s.charAt(len2-1-i)) {
				continue;
			}
			else {
				flag=false;
				break;
			
			}
				
		}
		System.out.println(flag?"pallindrome":"Not pallindrome");*/
		
		
	}
}
