package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
* @author:soleil
* @version 2018年2月5日 下午7:13:00
* 解释：Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
*/
public class _697DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        int minLength = nums.length;
        int degree = 0;
        HashMap<Integer, Integer> count = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer[]> index = new  HashMap<Integer,Integer[]>();
        
        for(int i=0;i<nums.length;i++){
        	count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        	degree = Math.max(degree, count.get(nums[i]));
        	
        	if(index.get(nums[i]) == null){
        		index.put(nums[i],new Integer[2]);
        	}
        	Integer[] numRange = index.get(nums[i]);
        	if(numRange[0] == null)numRange[0] = i;
        	numRange[1] = i;
        }
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
        	if(entry.getValue() != degree){
        		continue;
        	}
        	Integer[] range = index.get(entry.getKey());
        	minLength = Math.min(minLength, range[1]-range[0]+1);
        }
        
        return minLength;
    }
    
    public static void main(String[] args){
    	_697DegreeOfAnArray test = new _697DegreeOfAnArray();
    	int[] nums = {1};
    	 //HashMap<Integer, List<Integer>> res = new HashMap<Integer,List<Integer>>();
    	 test.findShortestSubArray(nums);
    	 
    }
}
