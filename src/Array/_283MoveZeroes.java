package Array;
/*
* @author:soleil
* @version 2018年1月31日 上午11:54:48
* 解释： Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
Note:
    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

*/
public class _283MoveZeroes {
    public void moveZeroes(int[] nums) {
    	if(nums != null && nums.length == 0) return;
    	int insertPost = 0;
    	for(int num : nums){
    		if(num != 0){
    			nums[insertPost++] = num;
    		}
    	}
		while(insertPost < nums.length){
			nums[insertPost++] = 0;
		}
    	
//        for(int i=0;i<length;i++){
//        	if(nums[i] != 0){
//        		if(i != count){
//            		nums[count] = nums[i];
//        		}
//        		count ++;
//        	}
//        }
//        for(int j=count;j<length;j++){
//        	nums[j] = 0;
//        }
    }
    public static void main(String[] args){
    	_283MoveZeroes test = new _283MoveZeroes();
    	int[] nums = {1,0};
    	test.moveZeroes(nums);
    	for(int i=0;i<nums.length;i++){
    		System.out.print(nums[i]);
    	}
    }
}
