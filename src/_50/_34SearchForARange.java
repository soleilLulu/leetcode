package _50;
/*
* @author:soleil
* @version 2018年2月15日 下午3:40:47
* 解释：Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
Your algorithm's runtime complexity must be in the order of O(log n).
If the target is not found in the array, return [-1, -1].
*/
public class _34SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int leftIndex = findIndex(nums,target,true);
        if(leftIndex == nums.length || nums[leftIndex] != target){
        	return res;
        }
        
        res[0] = leftIndex;
        res[1] = findIndex(nums,target,false)-1;
        
        return res;
    }
    public int findIndex(int[] nums,int target,boolean left){
    	int low = 0;
    	int high = nums.length;
    	
    	while(low < high){
    		int mid = (low + high)/2;
    		if(nums[mid] > target ||(left && target == nums[mid])){
    			high = mid;
    		}else{
    			low = mid +1;
    		}
    	}   	
    	return low;
    }
    public static void main(String[] args){
    	_34SearchForARange test = new _34SearchForARange();
    	int[] nums = {1,4};
    	test.searchRange(nums, 4);
    }
}
