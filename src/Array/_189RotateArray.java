package Array;
/*
* @author:soleil
* @version 2018年1月29日 下午2:09:35
* 解释：Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
*/
public class _189RotateArray {
	
    public void rotate(int[] nums, int k) {
    	
    	int length = nums.length;
    	
//    	if(length <= k){
//    		k = k-length; 
//    	}
    	
    	k = k % length; 
    	
    	int[] temp = new int[k];
    	
    	for(int i=0;i<k;i++){
    		temp[i] = nums[length-k+i];
    	}
    	for(int j=length-1;j>=k;j--){
    		nums[j] = nums[j-k];
    	}
    	System.arraycopy(temp, 0, nums, 0, k);
        
    }
    public static void main(String[] args){
    	
    	int nums[] = {1,2};
    	
    	_189RotateArray test = new _189RotateArray();
    	test.rotate(nums, 3);
    	
    	for(int i=0;i<nums.length;i++){
    		System.out.print(nums[i]);
    	}
    	
    }
}
