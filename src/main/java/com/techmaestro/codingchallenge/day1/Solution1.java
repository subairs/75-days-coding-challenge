package com.techmaestro.codingchallenge.day1;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] retunNums= new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i==j)
                	// skip one iteration
                    continue;
                if((nums[i]+nums[j])==target){
                    retunNums[0]=i;
                    retunNums[1]=j;
                    // break from loops
                    break;
                }
            }
            
        }
        
        return retunNums; 
    }
    
    
    public static void main(String args[]) {
    	
    	Solution1 solution1=new Solution1();
    	int[] array={1,2,3,4};
    	int[] twoSum=solution1.twoSum(array, 5);
    	System.out.println("["+twoSum[0]+" ,"+twoSum[1]+ "]");
    	
    }
    
    
}