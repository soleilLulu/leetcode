package _50;
/*
* @author:soleil
* @version 2018年2月14日 下午9:02:59
* 解释： Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory. 
*/
public class _31NextPermutation {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int i= length-2;
        while(i>=0 && nums[i+1] <= nums[i])i--;
        if(i >= 0){
        	int j = length -1;
        	while(j >= 0 && nums[j] <= nums[i])j--;
        	swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    public void reverse(int[] nums,int start){
    	int end = nums.length-1;
    	while(start < end){
    		swap(nums,start,end);
    		start ++;
    		end --;
    	}
    }
    
    public void swap(int[] nums,int i,int j){
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
