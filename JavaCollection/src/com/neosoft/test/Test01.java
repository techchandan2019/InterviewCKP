package com.neosoft.test;

public class Test01 {
	public static void main(String[] args) {
		CustomCollection cc=new CustomCollection();
		System.out.println(cc.size());
		System.out.println(cc.capacity());
		System.out.println(cc);
		
		cc.add("a");
		cc.add("ABC");
		cc.add(1);
		cc.add(null);
		System.out.println(cc.size());
		System.out.println(cc.capacity());
		System.out.println(cc);
		System.out.println(cc.indexOf("A"));
		System.out.println(cc.indexOf(null));
		System.out.println(cc.indexOf("a"));
		System.out.println(cc.get(1));
//		System.out.println(cc.get(5));
		System.out.println(cc);
		System.out.println(cc.remove(4));
		System.out.println(cc);
		
	
	
		
	}

}
