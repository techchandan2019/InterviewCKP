package com.neosoft.test;

public class Test11String {

	public static void main(String[] args) {
		/*String s1="madam";
		StringBuilder sb=new StringBuilder(s1);
		String s2=sb.reverse().toString();
		
		System.out.println(s1.equals(s2));*/
		
		/*System.out.println("find Fibonacci series sum");
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.println(fib(i));
			sum=sum+fib(i);
		}
		System.out.println("sum :"+sum);
	}
	public static int fib(int n) {
		if(n==1 ) {
			return 1;
		}
		if(n==0 ) {
			return 0;
		}
		return fib(n-1)+fib(n-2);
	} */
		//reverse a String using recursion
		/*	String s="chandan";
			reverse(s);
			
		}
		public static void reverse(String s) {
			if(s==null || s.length()==1)
				System.out.println(s);
			else {
				System.out.print(s.charAt(s.length()-1));
				reverse(s.substring(0,s.length()-1));
			}
			*/
	//print 1 to 100 in recursion
		print(100);
		
	}
	public static void print(int n) {
		if(n>1)
			print(n-1);
		
		System.out.print(n+" ");
	
	}
}
