package Array;
/*
* @author:soleil
* @version 2018年1月30日 下午10:34:42
* 解释：Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
Example 1
Input: [3,0,1]
Output: 2
Example 2
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity? 
*/
public class _268MissingNumber {
    public int missingNumber(int[] nums) {
    	int res = 0;
    	for(int i=0;i<nums.length;i++){
    		res = res + i - nums[i];
    	}
    	res += nums.length;
        return res;
    }
}
