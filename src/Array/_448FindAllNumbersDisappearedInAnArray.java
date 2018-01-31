package Array;

import java.util.ArrayList;
import java.util.List;

/*
* @author:soleil
* @version 2018年1月31日 下午9:44:40
* 解释：Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
Example:
Input:
[4,3,2,7,8,2,3,1]
Output:
[5,6]

*/
public class _448FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> res = new ArrayList<Integer>();
    	
    	for(int num : nums){
    		int val = Math.abs(num)-1;
    		if(nums[val] > 0){
    			nums[val] = - nums[val];
    		}
    	}
    	for(int i =0;i<nums.length;i++){
    		if(nums[i] > 0){
    			res.add(i+1);
    		}
    	}
    	return res;
    }
    public static void main(String[] args){
    	_448FindAllNumbersDisappearedInAnArray test = new _448FindAllNumbersDisappearedInAnArray();
    	int[] nums = {4,3,2,7,8,2,3,1};
    	List<Integer> result = test.findDisappearedNumbers(nums);
    	for(int i=0;i<result.size();i++){
    		System.out.print(result.get(i));
    	}
    }
}
