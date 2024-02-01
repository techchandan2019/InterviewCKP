package com.neosoft.basic;

public class Test04 {
	public static void main(String[] args) {
		System.out.println(isEven(10));
		System.out.println(isEven(11));
		//=======factorial
		//ncr
		System.out.println(ncrMethod(8, 0));
		System.out.println(ncrMethod(8, 2));
		//============prime
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(10));
		//==========countBit(ones)
		System.out.println(countBitOne(5));
		System.out.println(countBitOne(7));
		//==============
		//power of 2
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(8));
		System.out.println(isPowerOfTwo(10));
		
	}
	public static boolean isEven(int n) {
		if((n&1) !=0) {
			return false;
		}else {
			return true;
		}
	}
	public static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static int ncrMethod(int n,int r) {
		int numerator=fact(n);
		int denumerator=fact(n-r)*fact(r);
		return numerator/denumerator;
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int countBitOne(int n) {
		int c=0;
		while(n!=0) {
			if((n&1)>0)
				c++;
			
			n=n>>1;
		}
		return c;
	}
	public static boolean isPowerOfTwo(int n) {
		int c=0;
		while(n!=0) {
			if((n&1)>0)
				c++;
			
			n=n>>1;
		}
		return c==1;
	}

}
