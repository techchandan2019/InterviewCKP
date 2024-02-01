package com.neosoft.basic;

public class Test02 {
	public static void main(String[] args) {
	
		System.out.println(revese(123));
		System.out.println(revese((int)12399992912.0));
		//complements of 5
		System.out.println(complements(5));
	}
	public static int revese(int n) {
		//reverse
		int d;
		int rev=0;
		while(n!=0) {
			d=n%10;
			if((rev<Integer.MIN_VALUE/10)||(rev>Integer.MAX_VALUE/10))
				return 0;
			
			rev=(rev*10)+d;
			
			n=n/10;
		}
		return rev;
	}
	//complements
	public static int complements(int n) {
		int m=n;
		int mask=0;
		while(m!=0) {
			mask=(mask<<1)|1;
			m=m>>1;
		}
		int ans=(~n)&mask;
		return ans;
	}
}
