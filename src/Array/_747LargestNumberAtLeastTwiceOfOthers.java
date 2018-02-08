package Array;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年2月7日 下午12:22:42
* 解释：In a given integer array nums, there is always exactly one largest element.
Find whether the largest element in the array is at least twice as much as every other number in the array.
If it is, return the index of the largest element, otherwise return -1.
*/
public class _747LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
    	int index = 0;
    	int max1 = 0;
    	int max2 = 0;
    	
    	for(int i=0;i<nums.length;i++){
    		if(nums[i] > max1){
    			max2 = max1;
    			max1 = nums[i];
    			index = i;
    		}else if(nums[i] > max2){
    			max2 = nums[i];
    		}
    	}
    	if(max1 >= 2*max2){
    		return index;
    	}
        return -1;
    }
    
    public static void main(String[] args){
    	_747LargestNumberAtLeastTwiceOfOthers test = new _747LargestNumberAtLeastTwiceOfOthers();
    	int[] nums = {0,0,1,2};
    	System.out.println(test.dominantIndex(nums));
    }
}
