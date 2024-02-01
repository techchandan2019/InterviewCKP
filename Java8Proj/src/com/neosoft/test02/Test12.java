package com.neosoft.test02;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Optional;
import java.util.WeakHashMap;

/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 

Constraints:

0 <= n <= 105*/
public class Test12 {

	public static void main(String[] args) {
		int n=2;
		int n1=5;
		System.out.println(Arrays.toString(getBits(n)));
		System.out.println(Arrays.toString(getBits(n1)));
		
	}
	public static int[] getBits(int n) {
		
		 int[] arr = new int[n+1];
	        arr[0] = 0;
	      for(int i =1;i<=n;i++){
	    	  String binaryString = Integer.toBinaryString(i);
	    	  String[] sa=binaryString.split("");
	    	  long count = Arrays.stream(sa).filter(p->p.equals("1")).count();
	            arr[i] = (int) count;
	        }
	        return arr;
		
	}
}
