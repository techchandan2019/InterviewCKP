package com.neosoft.basic;

public class Test01 {
	
	public static void main(String[] args) {
	
		int n=5;
		//decimal to binary
		for(int i=0;i<32;i++) {
			if((n&1)>0)
				System.out.print(1);
			else
				System.out.print(0);
			
			n=n>>1;
		}
		System.out.println();
		System.out.println("====================");
		
		//==or=====
		int n1=4;
		int ans=0;
		int i=0;
		while(n1!=0) {
			
			int bits=n1&1;
			ans=(int) ((bits*Math.pow(10, i))+ans);
		
			i++;
			n1=n1>>1;
		}
		System.out.println(ans);
		
		//binary to decimal
		String s="00101";
		int k=0;
		int res=0;
		for(int j=s.length()-1;j>=0;j--) {
			char ch=s.charAt(j);
			if(ch=='1')
				res=(int) (res+Math.pow(2, k));
			
			k++;
		}
		System.out.println(res);
	}
}
