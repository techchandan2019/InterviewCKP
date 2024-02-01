package com.neosoft.test02;

/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1*/
public class Test09 {
	
	public static void main(String[] args) {
		int[] a= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(a));
		System.out.println(maxArea1(a));
		
		int[] a1= {1,1};
		System.out.println(maxArea(a1));
		System.out.println(maxArea1(a1));
	}
	public static int maxArea(int[] a) {
		int i=0;
		int j=a.length-1;
		int maxArea=0;
		while(i<j) {
			int minHeight=Math.min(a[i], a[j]);
			int area=minHeight*(j-i);
			
			maxArea=Math.max(maxArea, area);
			
			if(a[i]<a[j])
				i++;
			else
				j--;
		}
		return maxArea;
	}
	public static int maxArea1(int[] a) {
		
		int maxArea=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int area=(Math.min(a[i], a[j]))*(j-i);
				maxArea=Math.max(maxArea,area);
			}
		}
		return maxArea;
	}
}
