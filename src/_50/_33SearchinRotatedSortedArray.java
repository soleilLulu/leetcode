package _50;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年2月15日 上午9:54:53
* 解释：Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
You are given a target value to search. If found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array.
*/
public class _33SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
    	if(nums == null || nums.length == 0) return -1; 
    	int length = nums.length;
    	if(nums[length-1] == target)return length-1;
    	else if(nums[length-1] > target){
    		for(int i=length-1;i>=0;i--){
    			if(nums[i] == target) return i;
    			if(nums[i] <target) return -1;
    		}
    	}else{
    		for(int j=0;j<length;j++){
    			if(nums[j] == target) return j;
    			if(nums[j] > target) return -1;
    		}
    	}
    	return -1;
    }
}
