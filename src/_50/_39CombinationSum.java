package _50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* @author:soleil
* @version 2018年2月18日 下午11:02:03
* 解释： Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
The same repeated number may be chosen from C unlimited number of times. 
*/
public class _39CombinationSum {
	
	public List<List<Integer>> combinationSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(res,new ArrayList<>(),nums,target,0);
		return res;
	}
	public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int remain,int start){
		if(remain <0)return;
		if(remain == 0)res.add(new ArrayList<>(temp));
		else{
			for(int i=start;i<nums.length;i++){
				temp.add(nums[i]);
				backtrack(res,temp,nums,remain-nums[i],i);
				temp.remove(temp.size()-1);
			}
		}
	}
	
	
//	public List<List<Integer>> combinationSum(int[] nums, int target) {
//	    List<List<Integer>> list = new ArrayList<>();
//	    Arrays.sort(nums);
//	    backtrack(list, new ArrayList<>(), nums, target, 0);
//	    return list;
//	}
//
//	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
//	    if(remain < 0) return;
//	    else if(remain == 0) list.add(new ArrayList<>(tempList));
//	    else{ 
//	        for(int i = start; i < nums.length; i++){
//	            tempList.add(nums[i]);
//	            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
//	            tempList.remove(tempList.size() - 1);
//	        }
//	    }
//	}

}
