package com.techmaestro.codingchallenge.day2;

public class Solution1 {
	
	public static void main(String args[]) {
		int[] nums= {-9};
		sortedSquares(nums);
	}
	
	 public static  int[] sortedSquares(int[] nums) {
	        int[] squreNums=new int[nums.length];
	        int lastIndex=nums.length-1;
	        int firstIndex=0;
	        int k=lastIndex;
	        for(int i=0;i<nums.length;i++){
	        	
	        	squreNums[k--]=Math.max(nums[firstIndex]*nums[firstIndex],nums[lastIndex]*nums[lastIndex]);
	            if(nums[firstIndex]*nums[firstIndex]<nums[lastIndex]*nums[lastIndex])
	            	lastIndex--;
	            else
	            	firstIndex++;
	            	//k--;
	        	//squreNums[i]=nums[i]*nums[i];
	        	//squreNums[i+1]=nums[i+1]*nums[i+1];
	        	
	            
	        }
	        for(int i=0;i<nums.length;i++){
	           System.out.println(squreNums[i]);
	            
	        }
	        
			return squreNums;
	        
	    }

}
