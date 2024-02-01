package com.neosoft.test;

import java.util.Arrays;
import java.util.Stack;

public class Test03Paranthesis {

	public static void main(String[] args) {
		String s="{[()]}";
		char[] ch=s.toCharArray();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='}') {
				if(st.peek()=='{')
					st.pop();
			}else if(ch[i]==']') {
				if(st.peek()=='[')
					st.pop();
			}else if(ch[i]==')') {
				if(st.peek()=='(')
					st.pop();
			}else {
				st.push(ch[i]);
			}
			
		}
		if(st.isEmpty())
			System.out.println("perfect");
		else
			System.out.println("not closed");
	}
}
