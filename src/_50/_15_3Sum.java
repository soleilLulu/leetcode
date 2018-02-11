package _50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* @author:soleil
* @version 2018年2月11日 下午8:32:31
* 解释：Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
*/
public class _15_3Sum {
	
    public List<List<Integer>> threeSum(int[] nums) {
    	int length = nums.length;
    	 List<List<Integer>> res = new  ArrayList<List<Integer>>();
    	 Arrays.sort(nums);
    	
    	 for(int i=0;i<length-2;i++){
    		 //防止重复序列
    		 if(i ==0 || (i>0 && nums[i] != nums[i-1])){
    			 int low = i+1;
    			 int high = length-1;
    			 int target = -nums[i];
    			 
    			 while(low < high){
    				 if(nums[low]+nums[high] == target){
    					 res.add(Arrays.asList(nums[i], nums[low], nums[high]));
    					 while(low < high && nums[low] == nums[low+1])low++;
    					 while(low < high && nums[high] == nums[high-1])high--;
    					 low++;
    					 high--;
    				 }else if(nums[low]+nums[high] < target){
    					 low++;
    				 }else{
    					 high--;
    				 }
    			 }
    		 }
    	 }
    	
    	
        return res;
    }
    public static void main(String[] args){
    	_15_3Sum test = new _15_3Sum();
    	int[] nums = {-1, 0, 1, 2, -1, -4};
    	test.threeSum(nums);
    	
    }
}
