package com.neosoft.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test08 {

	public static void main(String[] args) {
		Stream<String> ss=Stream.of("chandan","abc","bbc");
		
		ss.forEach(p->System.out.println(p));
		
		
		//=================================
		/*Scanner scn=new Scanner(System.in);
		Integer[][] ia=new Integer[3][3];
		System.out.println("Enter numbers");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ia[i][j]=scn.nextInt();
			}
		}
		int k=0;
		int []a=new int[9];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[k++]=ia[i][j];
			}
		}
		System.out.println(Arrays.toString(a));*/
		
		//============================
		//Rotate a array
		int n=2;
		int[] ia1= {1,2,3,4,5};
		int len=ia1.length;
		for(int i=0;i<n;i++) {
			int temp=ia1[0];
			for(int j=0;j<len-1;j++) {
				ia1[j]=ia1[j+1];
			}
			ia1[len-1]=temp;
		}
		System.out.println(Arrays.toString(ia1));
		
	}
}
