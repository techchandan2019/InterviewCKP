package com.neosoft.basic;

import java.util.Stack;

public class Test13 {
	
	public static void main(String[] args) {
		String colors="aabaa";
		int[] neededTime= {1,2,3,4,1};
		System.out.println(minCost(colors,neededTime));
	}
	public static int minCost(String colors, int[] neededTime) {
        String[] sa=colors.split("");
        Stack<String> s=new Stack<>();
        s.add(sa[0]);
        int sum=0;
        for(int i=1;i<sa.length;i++){
        	if(!s.isEmpty() && s.peek().equals(sa[i])) {
        		s.pop();
        		sum=sum+Math.min(neededTime[i-1], neededTime[i]);
//        		sum=sum+neededTime[i];
        	}else {
        		s.push(sa[i]);
        	}
//        	System.out.println(sum);
        	System.out.println(s);
        }
        return sum;
    }

}
