package Array;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年2月3日 下午8:48:19
* 解释：Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value. 
* Example 1:
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75

*/
public class _643MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
    	double curr = 0;
    	double max = 0;   	
    	
    	for(int i=0;i<nums.length;i++){
    		if(i < k){
    			curr = curr + nums[i];
    			max = curr;
    			continue;
    		}
    		curr = curr + nums[i] - nums[i-k];	
    		max = (curr > max) ? curr : max ;
    		
    	}
    	
    	
    	return max/k;
        
    }
    
    public static void main(String[] args){
    	_643MaximumAverageSubarrayI test = new _643MaximumAverageSubarrayI();
    	int[] nums = {0,4,0,3,2};
    	System.out.println(test.findMaxAverage(nums, 1));
    }
}
