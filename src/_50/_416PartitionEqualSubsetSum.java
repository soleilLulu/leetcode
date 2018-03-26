package _50;
/*
* @author:soleil
* @version 2018年3月26日 下午2:42:46
* 解释：
*/
public class _416PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
    	
        if (nums == null || nums.length == 0)return true;
        int sum = 0;
        for(int num : nums){
        	sum += num;
        }
        if(sum % 2 != 0)return false;
        sum /= 2;
        
        boolean[] res  = new boolean[sum+1]; 
        int length = nums.length;
        
        res[0] = true;
        
        for(int i=1;i<=length;i++){
        	for(int j=sum;j>=nums[i-1];j--){
        		res[j] = res[j-nums[i-1]] || res[j];
        	}
        }
        
        return res[sum];
    }
    

    public static void main(String[] args){
    	_416PartitionEqualSubsetSum test = new _416PartitionEqualSubsetSum();
    }
}
