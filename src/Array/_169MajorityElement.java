package Array;

import java.util.Arrays;
import java.util.HashMap;

/*
* @author:soleil
* @version 2018年1月29日 上午10:40:33
* 解释：Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
*/
public class _169MajorityElement {
	
//	HashMap实现 时间复杂度O(n)
//    public int majorityElement(int[] nums) {
//    	HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
//    	int length = nums.length;
//    	if(length<=1){
//    		return nums[0];
//    	}
//    	for(int i=0;i<length;i++){
//    		if(count.get(nums[i]) != null){
//    			int temp = count.get(nums[i]);
//        		count.put(nums[i],temp+1);  
//        		if(temp+1 > length/2){
//        			return nums[i];
//        		}
//    		}else{
//    			count.put(nums[i], 1);
//    		}
//
//    	}
//    	
//        return -1;
//    }
	
	//思想：对于一个排序好的数组，第n/2的位置的元素一定是存在的这个众数
//	public int majorityElement(int[] nums) {
//		
//		Arrays.sort(nums);
//		return nums[nums.length/2];
//	}
	
	//第三种：
	public int majorityElement(int[] nums) {
		int res = nums[0];
		int count = 1;
		
		for(int i=1;i<nums.length;i++){
			if(nums[i] == res) count ++;
			else if(count >1) count --;
			else res = nums[i];
		}
		return res;
	}
    public static void mian(String[] args){
    	_169MajorityElement test = new _169MajorityElement();
    	int[] nums = {2,2,3,4,2};
    	System.out.println(test.majorityElement(nums));
    }
}
