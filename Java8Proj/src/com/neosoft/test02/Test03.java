package com.neosoft.test02;

/*Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string that reads the same backward. More formally, S is a palindrome if reverse(S) = S. In case of conflict, return the substring which occurs first ( with the least starting index).

Example 1:

Input:
S = "aaaabbaa"
Output: aabbaa
Explanation: The longest Palindromic
substring is "aabbaa".
Example 2:

Input: 
S = "abc"
Output: a
Explanation: "a", "b" and "c" are the 
longest palindromes with same length.
The result is the one with the least
starting index.*/
public class Test03 {
	public static void main(String[] args) {
		String s="abc";
		String s1="aaaabbaa";
		System.out.println(getMaxpalindromic(s));
		System.out.println(getMaxpalindromic(s1));
	}
	public static String getMaxpalindromic(String s) {
		StringBuilder sb=new StringBuilder(s);
		if(s.equals(sb.reverse().toString()))
			return s;
		
		String l=getMaxpalindromic(s.substring(1));
		String r=getMaxpalindromic(s.substring(0,s.length()-1));
		
		if(l.length()>r.length())
			return l;
		else
			return r;
	}
}
