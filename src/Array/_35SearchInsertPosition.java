package Array;
/*
* @author:soleil
* @version 2018年1月8日 下午1:22:55
* 解释：Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.
*/
public class _35SearchInsertPosition {
	
//	public int solution(int[] nums,int target){
//		for(int i=0;i<nums.length;i++){
//			if(nums[i] >= target){
//				return i;
//			}
//		}
//		return nums.length;
//	}
	public int solution(int[] nums,int target){
		int low = 0;
		int high = nums.length-1;
		
		while(low <= high){
			int mid = (low + high)/2;
			if(nums[mid] == target){
				return mid;
			}else if(nums[mid] > target){
				high = mid -1;
			}else{
				low = mid +1;
			}
		}
	
		return low;
	}
	
	public static void main(String[] args){
		_35SearchInsertPosition test = new _35SearchInsertPosition(); 
		int[] nums = {1,3,5,6};
		int result = test.solution(nums, 7);
		System.out.println(result);
	}
	

}
