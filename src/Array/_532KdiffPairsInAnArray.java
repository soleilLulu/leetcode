package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* @author:soleil
* @version 2018年2月1日 上午11:27:14
* 解释： Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
Example 1:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 3:
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
Note:
    The pairs (i, j) and (j, i) count as the same pair.
    The length of the array won't exceed 10,000.
    All the integers in the given input belong to the range: [-1e7, 1e7].
*/
public class _532KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        int res = 0;
        if(k < 0)return 0;
        if(k == 0){
        	HashMap<Integer,Integer> countZero = new HashMap<Integer,Integer>();
        	for(int i=0;i<nums.length;i++){
        		if(countZero.containsKey(nums[i])){
        			if(countZero.get(nums[i]) == 1){
        				res ++;
        				countZero.put(nums[i], 2);
        			}
        		}else{
            		countZero.put(nums[i], 1);	
        		}
        	}
        }else{    	
        	Set<Integer> count = new HashSet<Integer>();
        	for(int num : nums){
        		if(!count.add(num)){continue;}
        		if(count.contains(num+k)){
        			res ++;
        		} 
        		if(count.contains(num-k)){
        			res ++;
        		}
        	}
        	
        }
        return res;
    }
    
    public static void main(String[] args){
    	_532KdiffPairsInAnArray test = new _532KdiffPairsInAnArray();
    	int[] nums = {6,3,5,7,2,3,3,8,2,4};
    	test.findPairs(nums, 2);
    }
    
}
