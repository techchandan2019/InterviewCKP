package com.neosoft.basic;

public class Test08BinarySearchProblem {

	public static void main(String[] args) {
		int[] nums= {4,5,6,7,8,1,2,3};
		int key=1;
		
//		int []nums1= {0,1,2,3,4,5};
		System.out.println(getMaxElementIndex(nums));
//		System.out.println(binarySearch(nums1, key, 0, nums1.length-1));
		 int pivotal=getPivotal(nums);
		 System.out.println(pivotal);
//		int pivotal=getMaxElementIndex(nums)+1;
			/*			 System.out.println(pivotal);
					 int result=-1;
					 if(nums[pivotal]>=key)
					 result=binarySearch(nums,key,0,pivotal-1);
					 else
					 result=binarySearch(nums,key,pivotal,nums.length-1);
					
					System.out.println(result);*/
		
		System.out.println(findSqRoot(36));
		
		//======================
		System.out.println("==========");
		int[] nums1= {4,5,6,7,9,0,1,2,3};
		System.out.println(getMaxElementIndex(nums1));
//		int []sortedArr=sortArrayBySelectionSort(nums1);
//		int maxVal=sortedArr[sortedArr.length-1];
//		System.out.println("maxElement "+maxVal);
//		System.out.println(getMaxElementIndexAndMax(nums, maxVal));
	}
	public static int binarySearch(int[] nums,int key,int s,int e){
		  
	    int  mid=s+((e-s)/2);
	    while(s<=e){
	        if(nums[mid]==key)
	            return mid;
	        else if(key>nums[mid])
	            s=mid+1;
	        else
	            e=mid-1;

	        mid=s+((e-s)/2);
	    }
	    return mid;
	}
	public static int getPivotal(int[] nums){
	    int s=0;
	    int e=nums.length-1;
	    int  mid=s+((e-s)/2);
		/*  while(e>s){
		    if(nums[mid]>=nums[s])
		        s=mid+1;
		    else {
		        e=mid;
		    }
		        mid=s+((e-s)/2);
		}*/
	    while(s<e) {
	    	mid=s+(e-s)/2;
	    	if(nums[mid]>nums[e])
	    		s=mid+1;
	    	else
	    		e=mid;
	    }
	    
	    return s;
	}
	public static int getMaxElementIndex(int nums[]) {
		int s=0;
		int e=nums.length-1;
		int mid=s+((e-s)/2);
		
		while(s<e) {
			mid=s+(e-s)/2;
			if(nums[mid]>nums[mid+1])
				return mid;
			else if(nums[mid]>=nums[s])
				s=mid+1;
			else
				e=mid;
		}
		return s;
			  
	}

	
	public static int findSqRoot(int n) {
		int s=0;
		int e=n;
		int mid=s+(e-s)/2;
		int ans=-1;
		while(e>=s) {
			if(mid*mid==n)
				return mid;
			else if(mid*mid<n) {
				s=mid+1;
				ans=mid;
			}
			else
				e=mid-1;
			
			mid=s+(e-s)/2;
		}
		return ans;
	}
	public static int[] sortArrayBySelectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i])
					min=j;
				
				//swap
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		return a;
	}
}
