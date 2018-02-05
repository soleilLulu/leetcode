package Array;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年2月3日 下午4:22:35
* 解释：Given an integer array, find three numbers whose product is maximum and output the maximum product.
*/
public class _628MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Integer max1 = Integer.MIN_VALUE;Integer max2 = max1;Integer max3 = max1;
        Integer min1 = Integer.MAX_VALUE;Integer min2 = min1;
        
        for(int num : nums){
        	if(num > max1){
        		max3 = max2;
        		max2 = max1;
        		max1 = num;
        	}else if(num > max2){
        		max3 = max2;
        		max2 = num;
        	}else if(num > max3){
        		max3 = num;
        	}
        	
        	if(num < min1){
        		min2 = min1;
        		min1 = num;
        	}else if(num < min2){
        		min2 = num;
        	}
        	
        }
        
        
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}
