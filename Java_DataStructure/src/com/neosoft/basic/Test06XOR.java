package com.neosoft.basic;

public class Test06XOR {

	public static void main(String[] args) {
		String s="xxooooxxx";
		int ans=0;
		for(int i=0;i<s.length();i++) {
			ans=ans^s.charAt(i);
		}
		System.out.println(ans);
	}
}
