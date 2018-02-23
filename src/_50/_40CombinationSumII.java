package _50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* @author:soleil
* @version 2018年2月21日 上午11:55:44
* 解释： Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
Each number in C may only be used once in the combination. 
*/
public class _40CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	backtrack(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> tempList,int[] candidates,int remain,int start){
    	if(remain < 0)return;
    	if(remain == 0){
    		res.add(new ArrayList<>(tempList));
    	}else{
    		for(int i=start;i<candidates.length;i++){
    			if(i > start && candidates[i] == candidates[i-1]) continue;
    			tempList.add(candidates[i]);
    			backtrack(res,tempList,candidates,remain-candidates[i],i+1);
    			//System.out.println(tempList);
    			tempList.remove(tempList.size()-1);
    		}
    	}
    	
    }
    
    public static void main(String[] args){
    	_40CombinationSumII test = new _40CombinationSumII();
    	int[] candidates = {10,1,2,7,6,1,5};
    	test.combinationSum2(candidates, 8);
    }
}
