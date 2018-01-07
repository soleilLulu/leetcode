package Array;
/*
* @author:soleil
* @version 2018年1月7日 下午5:37:12
* 解释：Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/
public class _27RemoveElement {
	//方法一
	public int removeElement(int[] nums, int val) {
		if(nums.length == 0){
			return 0;
		}
		int res = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] != val){
				nums[res++] = nums[i] ;
			}
		}
		
		return res;
	}
	
	//方法二
//	public int removeElement(int[] nums, int val) {
//	    int i = 0;
//	    int n = nums.length;
//	    while (i < n) {
//	        if (nums[i] == val) {
//	            nums[i] = nums[n - 1];
//	            // reduce array size by one
//	            n--;
//	        } else {
//	            i++;
//	        }
//	    }
//	    return n;
//	}

	
	public static void main(String[] args){
		_27RemoveElement test = new _27RemoveElement();
		int[] nums = {1,2,3,4};	
		int result = test.removeElement(nums, 1);
		System.out.println(result);
	}

}
