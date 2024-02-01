package com.neosoft.basic;

public class Test03_Switch {
	
	public static void main(String[] args) {
		int num=2;
		Integer i=19;
		char ch='1';
		String s="abc";
		Boolean x=true;
		Double d=10.0;
		switch(num) {
//		switch(ch) {
//		switch(s) {
//		switch(i) {
//		switch(x) {//error
//		switch(d) {//error
		case 1:
			System.out.println("First");
			break;
		case 2: 
			System.out.println("Second");
			break;
			
		default:
			System.out.println("default");
			break;
		}
		
		//==============
		int number=1330;
		int remaining=number;
		int hundred=0;
		int fifty=0;
		int twenty=0;
		int one=0;
		while(remaining!=0) {
			switch(remaining/100) {
			case 0:
				switch(remaining/50) {
				case 0:
					switch(remaining/20) {
					case 0:
						switch(remaining/1) {
						case 0:
							break;
						default:
						one=remaining;
						remaining=0;
						break;
						}
						break;
					default:
					twenty=(remaining/20);
					remaining=remaining%20;
					break;
					}
					break;
				default:
				fifty=(remaining/50);
				remaining=remaining%50;
				break;
				}
				break;
				default:
				hundred=(remaining/100);
				remaining=remaining%100;
				break;
			}
		}
		System.out.println("hundred "+hundred);
		System.out.println("fifty "+fifty);
		System.out.println("twenty "+twenty);
		System.out.println("one "+one);
	}

}
