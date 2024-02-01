package com.neosoft.test;

import java.util.ArrayList;
import java.util.List;

public class Test18Generics {
	
	public static void main(String[] args) {
		/*	List<Integer> li4=new ArrayList<>();
		li4.add(10);
		li4.add(10);
		m1(li4);
		System.out.println(li4);*/
	//	li4.add("abc");

		//=========================
		List<? super Number> li=new ArrayList<>();
		
		li.add(10);
		li.add(10.0);
//		li.add(true);
//		li.add('a');
//		li.add("abc");
		li.add(null);
		
		//=========================
		List<? super Object> li1=new ArrayList<>();
		li1.add(10);
		li1.add(10.0);
		li1.add(true);
		li1.add('a');
		li1.add("abc");
		li1.add(null);
		
		
		//=========================
		List<? extends Object> li2=new ArrayList<>();
//		li2.add(10);
//		li2.add(10.0);
//		li2.add(true);
//		li2.add('a');
//		li2.add("abc");
		li2.add(null);
		//=========================
		List<String > li3=new ArrayList<>();
		List<Boolean > li4=new ArrayList<>();
		List<Integer > li5=new ArrayList<>();
		li3.add("10");
		li3.add("10.0");
		li3.add("true");
		m2(li3);
		m2(li4);
		m2(li5);
		//=========================
		
		
	
	}
	public static void m1(List li) {
		li.add(10);
		li.add(10.0);
		li.add(true);
	}
	public static List<? extends Number> m2(List<? extends Object> li) {
		System.out.println(li);
		
		List<Integer> li1=new ArrayList<>();
		return li1;
//		li.add(10);
	}

}

class Test<T extends Number & Runnable>{}
//class Test<? extends Number & Runnable>{}
