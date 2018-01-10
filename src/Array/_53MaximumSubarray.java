package Array;
/*
* @author:soleil
* @version 2018年1月9日 下午6:17:56
* 解释： Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

click to show more practice.
*/
public class _53MaximumSubarray {
	public int maxSubArray(int[] nums) {
		//对于每一个元素，都要判断一下是和前面的加和较大还是自己单开一个元素大
		int max = Integer.MIN_VALUE;
		int nowNum = 0;

		for(int i=0;i<nums.length;i++){
			if(nowNum < 0){
				nowNum = nums[i];
				max = Math.max(max, nowNum);
			}else{
				nowNum = nowNum + nums[i];
				max = Math.max(max, nowNum);
			}
		}
		
		return max;
	}
	
	public static void main(String[] args){
		_53MaximumSubarray test = new _53MaximumSubarray();
		int[] nums = {8,-19,5,-4,20};
		int result = test.maxSubArray(nums);
		System.out.println(result);
	}

}
