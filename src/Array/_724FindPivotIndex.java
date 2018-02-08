package Array;
/*
* @author:soleil
* @version 2018年2月6日 上午11:51:01
* 解释：Given an array of integers nums, write a method that returns the "pivot" index of this array.
We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index. 
*/
public class _724FindPivotIndex {
    public int pivotIndex(int[] nums) {
    	int length = nums.length;
    	if(length == 0 || length ==1)return -1;
    	int sum = 0;
    	
    	for(int num : nums)sum += num;
    	
    	if(sum-nums[0] == 0)return 0;
    	int left = 0;
    	for(int i=1;i<length;i++){
    		left += nums[i-1];
    		if(sum - left - nums[i] == left){
    			return i;
    		}
    	}
    	
        return -1;
    }
    
    public static void main(String[] args){
    	_724FindPivotIndex test = new _724FindPivotIndex();
    	int[] nums = {1,2,3};
    	System.out.println(test.pivotIndex(nums));
    }
}
