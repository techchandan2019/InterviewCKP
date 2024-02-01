package com.neosoft.test;

import java.util.Scanner;

public class Test14Permutation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Message :");
		String s=scn.nextLine();
		permutation(s,"");
	}
	public static void permutation(String str,String res) {
		
		if(str.length()==0) {
			System.out.println(res);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String left=str.substring(0, i);
			String right=str.substring(i+1);
			String add=left+right;
			permutation(add,res+ch);
		}
	}
}

