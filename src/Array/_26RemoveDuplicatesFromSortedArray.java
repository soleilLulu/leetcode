package Array;
/*
* @author:soleil
* @version 2017年10月15日 下午5:12:57
* 解释： 
* Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length. 
*/
public class _26RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums.length <= 1){
			return nums.length;
		}
		int res = 1;
		for(int i = 1;i<nums.length;i++){
			if(nums[i] != nums[i-1]){
				System.out.println(nums[i]+"hello"+nums[i-1]);
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args){
		_26RemoveDuplicatesFromSortedArray test = new _26RemoveDuplicatesFromSortedArray();
		int[] nums = {1,1,2,2,3,4,5,5};
		System.out.println(test.removeDuplicates(nums));
	}
}
