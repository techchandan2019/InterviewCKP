package com.neosoft.test;

public class Test17 {

	public static void main(String[] args) {
		ABC abc=new ABC();
		abc.m1();
		System.out.println(abc.hashCode());
	}
}
class ABC{
	public void m1() {
		System.out.println(this.hashCode());
	}
}

