package Array;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年1月31日 下午8:27:55
* 解释：Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).


Example 2:

Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:

Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

*/
public class _414ThirdMaximumNumber {
	//预排序算法 不行，因为要求时间复杂度是O（n）
//    public int thirdMax(int[] nums) {
//    	//if(nums == null || nums.length == 0) return Integer.MIN_VALUE;
//    	int length = nums.length;
//    	if(length == 1) return nums[0];
//    	
//    	Arrays.sort(nums);
//    	int count = 1;
//    	int curr = nums[length-1];
//    	for(int i=length-1;i>=0;i--){
//    		if(nums[i] != curr){
//    			count++;
//    			curr = nums[i];
//    		}
//    		if(count >= 3){
//    			return curr;
//    		}
//    	}
//        return nums[length-1];
//    }
	
	//线性时间解法
	public int thirdMax(int[] nums) {
		Integer max1=null;
		Integer max2=null;
		Integer max3=null;
		
		for(Integer num : nums){
			if(num.equals(max1) || num.equals(max2) || num.equals(max3)) continue;
			if(max1 == null || num > max1 ){
				max3 = max2;
				max2 = max1;
				max1 = num;
			}else if( max2 == null || num > max2){
				max3 = max2;
				max2 = num;
			}else if( max3 == null || num > max3){
				max3 = num;
			}
		}
		return max3 == null ? max1 : max3;
	}
    
    public static void main(String[] args){
    	_414ThirdMaximumNumber test = new _414ThirdMaximumNumber();
    	int[] nums = {1,2};
    	System.out.println(test.thirdMax(nums));
    }
}
