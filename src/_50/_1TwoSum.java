package _50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
* @author:soleil
* @version 2018年2月28日 下午2:46:57
* 解释：Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
public class _1TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] res  = {-1,-1};
		HashMap<Integer,Integer> remain = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(remain.containsKey(nums[i])){
				res[0] = remain.get(nums[i]);
				res[1] = i;
				//System.out.println(res[0]+","+res[1]);
				return res;
			}else{
				remain.put(target-nums[i], i);
			}
		}

		return res;
	}
	
	public static void main(String[] args){
		_1TwoSum test = new _1TwoSum();
		int[] nums = {2, 7, 11, 15};
		test.twoSum(nums, 9);
	}
}
