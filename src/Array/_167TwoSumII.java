package Array;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年1月18日 下午6:52:21
* 解释：Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2 
*/
public class _167TwoSumII {
	
    public int[] twoSum(int[] numbers, int target) {

    	int[] res = new int[2];
    	if(numbers == null || numbers.length <2){
    		return res;
    	}
    	
    	int left = 0;
    	int right = numbers.length-1;    	
    	while(left < right){
    		int temp = numbers[left] + numbers[right];
    		if(temp == target){
    			res[0] = left + 1;
    			res[1] = right +1;
    			return res;
    		}else if(temp >target){
    			right --;
    		}else{
    			left++;
    		}
    	}
    	
    	
        return res;
    }
    public static void main(String[] args){
    	_167TwoSumII test = new _167TwoSumII();
    	int[] numbers = {5,25,75};
    	int[] result = test.twoSum(numbers, 100);
    	
    	for(int i=0;i<result.length;i++){
    		System.out.println(result[i]);
    	}
    }
}
