package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* @author:soleil
* @version 2018年1月30日 上午11:52:09
* 解释：Given an array of integers and an integer k, 
* find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
* and the absolute difference between i and j is at most k. 
*/
public class _219ContainsDuplicateII {
	//第一种解法：对于每一个数组元素，判断是否已经存在于hashmap中。key存储元素的值，value存储index。
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//    	int length = nums.length;
//    	if(length <= 1){
//    		return false;
//    	}
//    	
//    	HashMap<Integer,String> count = new HashMap<Integer,String>();
//    	count.put(nums[0], "0");
//    	
//    	for(int i=1;i<length;i++){
//    		int tempKey = nums[i];
//    		if(count.containsKey(tempKey)){
//    			String index = count.get(tempKey); //获取等于这个值的位置
//    			if(i-Integer.parseInt(index) <= k){
//    				return true;
//    			}else{
//    				count.put(tempKey, Integer.toString(i));
//    			}
//    			
//    		}else{
//    			count.put(tempKey, Integer.toString(i));
//    		}
//    	}
//    	
//        return false;
//    }
    //第二种解法
	public boolean containsNearbyDuplicate(int[] nums, int k){
		int length = nums.length;
		if(length<=1) return false;
		Set<Integer> count = new HashSet<Integer>();
		
		for(int i=0;i<length;i++){
			if(i > k){
				count.remove(nums[i-k-1]);
			}
			if(!count.add(nums[i])){
				return true;
			}
		}
		return false;
	}
    public static void main(String[] args){
    	_219ContainsDuplicateII test = new _219ContainsDuplicateII();
    	int[] nums = {1,0,1,1};    	
    	System.out.println(test.containsNearbyDuplicate(nums, 1));
    }
}
