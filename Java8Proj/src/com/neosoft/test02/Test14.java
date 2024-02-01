package com.neosoft.test02;

/*Reverse bits of a given 32 bits unsigned integer.

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 

Example 1:

Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
Example 2:

Input: n = 11111111111111111111111111111101
Output:   3221225471 (10111111111111111111111111111111)
Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
 

Constraints:

The input must be a binary string of length 32*/
public class Test14 {

	public static void main(String[] args) {
		String s="00000010100101000001111010011100";
		String s2="100";
		
		System.out.println(getReverseDigit(s));
		
		System.out.println(getReverseDigit(s2));
	}
	public static int getReverseDigit(String s) {
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		int sum=0;
		int k=0;
		for(int i=sb.length()-1;i>=0;i--) {
			if(sb.charAt(i)=='1')
				sum=(int) (sum+Math.pow(2, k));
			
			k++;
		}
		return sum;
	}
}
