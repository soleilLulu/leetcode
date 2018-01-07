package Array;
/*
* @author:soleil
* @version 2017年10月13日 上午11:55:32
* 解释：
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
public class _1TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	int[] result = {-1,-1};
    	boolean finish = false;
    	
    	for(int i=0;i<nums.length-1;i++){
    		if(finish){
    			break;
    		}
    		int temp = target - nums[i];   			
    		for(int j=i+1;j<nums.length;j++){
    			if(nums[j]==temp){
    					finish = true;
    					result[1] = j;
    					result[0] = i;
    					break;
    			}
    		}
    	}
    	
        return result;
    }
    public static void main(String[] args){
    	_1TwoSum test = new _1TwoSum();
    	int[] nums = {2,7,11,18};
    	int[] result = test.twoSum(nums,20);
    	
    	System.out.println(result[0]+"he"+result[1]);
    }
}
