package com.techmaestro.codingchallenge.day1;

/**
 * 
 * @author subair
 *Move Zeroes
 *Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

 */

class Solution4 {
	public static void main(String args[]) {
		Solution4 solution4 = new Solution4();
		int[] arr = { 1,0 };
		solution4.moveZeroes(arr);
	}

	void moveZeroes(int[] nums) {

		int flag = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == 0) {
				continue;
			} else {
				if (flag == j) {
					flag++;

				} else {
					nums[flag] = nums[j];
					nums[j] = 0;
					flag++;
				}
			}
		}
	
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
	}

}
