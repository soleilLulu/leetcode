package Array;
/*
* @author:soleil
* @version 2018年2月1日 上午10:30:22
* 解释：Given a binary array, find the maximum number of consecutive 1s in this array.
Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:
    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000
*/
public class _485MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int curr = 0;
        for(int num : nums){
        	if(num == 1){
        		curr++;
        		if(curr > res) res = curr;
        	}else{
        		curr = 0;
        	}
        }
        return res;
    }
    
    public static void main(String[] args){
    	_485MaxConsecutiveOnes test = new _485MaxConsecutiveOnes();
    	int[] nums = {1,1,0,1,1,1};
    	System.out.println(test.findMaxConsecutiveOnes(nums));
    }
}
