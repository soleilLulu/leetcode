package Array;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年2月1日 下午3:03:29
* 解释： Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
Example 1:
Input: [1,4,3,2]
Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

*/
public class _561ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
        	res = res + nums[i];
        }
        return res;
    }
}
