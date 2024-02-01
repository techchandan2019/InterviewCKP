package com.neosoft.test;

public class Test08 {
	public static void main(String[] args) {
//		boolean a=false;
		boolean a=true;
		boolean b=true;
//		boolean b=false;
		
		/*if(a & b) {
			System.out.println("Hi");
		}*/
		/*A a1=new A();
		a1.setName("ckp");*/
		A a1=null;
		//A a2=null;
		
		if(!a & true) {
			System.out.println("Hello");
		}
	}
}
class A{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
