package com.neosoft.basic;

import java.util.Stack;

public class Test12 {

	public static void main(String[] args) {
		String s="test";
		
		//getMax repeated charachter
		//=================================
//		store count in a array for every element
		int[] a=new int[26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int index=0;
			if(ch>='a' && ch<='z')
				index=ch-'a';
			a[index]=a[index]+1;
		}
		//getMax Element
		int max=-1;
		int ans=0;
		for(int i=0;i<26;i++) {
			if(max<a[i]) {
				max=a[i];
				ans=i;
			}
		}
		System.out.println((char)(ans+'a'));
		
		//=======================
		//remove all occurence of substring
		String s1="daabcbaabcbc";
		String s2="abc";
		//output=>dab
		
		
		
		while(s1.length()!=0 && s1.contains(s2)) {
			s1=s1.replace(s2, "");
		}
		System.out.println(s1);
		
		//==================
		//remove adject duplicate element
		
		String s3="azxxzy";
		//output==>ay
		
		Stack<Character> st=new Stack<>();
		st.push(s3.charAt(0));
		for(int i=1;i<s3.length();i++) {
			char ch=s3.charAt(i);
			if(st.peek()==ch) {
				st.pop();
			}else{
				st.push(ch);
			}
			
		}
		
		System.out.println(st);
		
	}
	
}
