package com.neosoft.test02;

public class Test01 {
	public static void main(String[] args) {
		String s="10#11#12";
		String s1="1326#";
		System.out.println(getString(s));
		System.out.println(getString(s1));
	}
	public static String getString(String s) {
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s.length()) {
			if(i+2<s.length() && s.charAt(i+2)=='#') {
				int n=Integer.parseInt(s.substring(i,i+2));
				sb.append((char)('a'+(n-1)));
				i=i+3;
			}else {
				int n=Integer.parseInt(s.substring(i,i+1));
				sb.append((char)('a'+(n-1)));
				i++;
			}
		}
		return sb.toString();
	}

}
