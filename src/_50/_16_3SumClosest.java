package _50;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年2月12日 上午10:48:11
* 解释：Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
*/
public class _16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
        	int temp = target - nums[i];
        	int low = i+1;
        	int high = nums.length-1;       	
        	while(low < high){
        		int diff =   nums[low]+nums[high]-temp;
        		if(diff == 0) return target;
        		if(Math.abs(min) > Math.abs(diff)){
        			min = diff;
        			}
        		if(diff > 0)high--;
        		else low++;
        			
        	}
        }
        
        return target+min;
    }
    
    public static void main(String[] args){
    	_16_3SumClosest test = new _16_3SumClosest();
    	int[] nums ={1,1,-1,-1,3};
    	System.out.println(test.threeSumClosest(nums, -1));
    }
}
