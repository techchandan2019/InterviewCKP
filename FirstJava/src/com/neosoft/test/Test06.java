package com.neosoft.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test06 {
	
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(10,20,30,40);
		
		li.parallelStream().forEach(p->System.out.print(p+" "));
		System.out.println();

		List<Integer> li2=li.parallelStream().collect(Collectors.toList());
		System.out.println(li2);
		
		//segregate the 0 and 1==========================
		int[] ia= {0,1,0,1,1,0,0,0,1};
		int[] ia2=new int[ia.length];
		int k=0;
		for(int i=0;i<ia.length;i++) {
			if(ia[i]==0)
				ia2[k++]=0;
				
		}
		for(int i=k;i<ia.length;i++) {
			ia2[i]=1;
		}
		System.out.println(Arrays.toString(ia2));//[0, 0, 0, 0, 0, 1, 1, 1, 1]
	}
}
