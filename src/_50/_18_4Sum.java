package _50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* @author:soleil
* @version 2018年2月13日 上午10:57:41
* 解释：Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
*/
public class _18_4Sum {
	
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	Arrays.sort(nums);
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	int length = nums.length;
    	if(length<4 || target > nums[length-1]*4 || target < nums[0]*4)return res;
    	
    	for(int i=0;i<length-3;i++){
    		if(i == 0 || (i>0 && nums[i] != nums[i-1])){
        		for(int j=i+1;j<length-2;j++){
        			if((j == i+1 || nums[j] != nums[j-1])){
            			int tempTarget = target-nums[i]-nums[j];
            			int low = j+1;
            			int high = length-1;
            			while(low < high){
            				if(nums[low]+nums[high] == tempTarget){
            					res.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
            					while(low < high && nums[low] == nums[low+1])low++;
            					while(low < high && nums[high] == nums[high-1])high--;
            					low++;
            					high--;
            				}else if(nums[low] + nums[high] > tempTarget){
            					high--;
            				}else{
            					low++;
            				}
            			}
        			}
        		}
    			
    		}
    	}
        return res;
    }
    
    public static void main(String[] args){
    	_18_4Sum test = new _18_4Sum();
    	int[] nums ={-3,-2,-1,0,0,1,2,3};
    	test.fourSum(nums, 0);
    }
}
