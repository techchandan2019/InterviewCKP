package com.neosoft.test;

public class Test15 {
	
	public static void main(String[] args) {
		/*Integer i1=-128;//-128 to 127
		Integer i2=-128;
		
		System.out.println(i1.equals(i2));//true
		System.out.println(i1==i2);//true
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		System.out.println("==========");
		//====================================
		Integer i3=new Integer(1);
		Integer i4=new Integer(1);
		
		System.out.println(i3.equals(i4));//true
		System.out.println(i3==i4);//false
		
		//=============================
		Integer i5=Integer.valueOf(1);
		Integer i6=Integer.valueOf(1);
		
		System.out.println(i5.equals(i6));//true
		System.out.println(i5==i6);//true
		
		Double i7=2.9;
		Double i8=2.9;
		System.out.println("-----------------");
		System.out.println(i7.equals(i8));//true
		System.out.println(i7==i8);//false
		
		*/
		/*
		String s1="FB";
		String s2="Ea";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		Integer i1=97;
		String i2="a";
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
//		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));//false
		
		
	}
}
