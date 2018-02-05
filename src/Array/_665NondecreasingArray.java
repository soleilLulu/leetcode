package Array;
/*
* @author:soleil
* @version 2018年2月5日 上午10:50:26
* 解释： Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n). 
*/
public class _665NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
    	int count  = 0;
    	for(int i=1;i<nums.length && count <=1;i++){
    		if(nums[i] < nums[i-1]){
    			count ++;
    			if(i-2<0 || nums[i-2] < nums[i]) nums[i-1] = nums[i];
    			else nums[i] = nums[i-1];
    		}
    	}
    	
    	return count <= 1;
    }
    
    public static void main(String[] args){
    	 _665NondecreasingArray test = new  _665NondecreasingArray();
    	 int[] nums = {2,3,3,2,4};
    	 System.out.println(test.checkPossibility(nums));
    }
}
