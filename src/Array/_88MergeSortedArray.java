package Array;

import java.util.Arrays;

/*
* @author:soleil
* @version 2018年1月11日 下午2:03:17
* 解释：Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
Note:You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.
*/
public class _88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	
    	int i = m-1;
    	int j = n-1;
    	int k = m+n-1 ;
    	
    	while(i >= 0 && j >= 0 ){    		
    		if(nums1[i] > nums2[j]){
    			nums1[k--] = nums1[i--];
    		}else{
    			nums1[k--] = nums2[j--];
    		}
    	}
    	
    	while(j >= 0){
    		nums1[k--] = nums2[j--];
    	}
    	
    	
    }
   
    public static void main(String[] args){
//    	_88MergeSortedArray test = new _88MergeSortedArray();
//    	int m = 1;
//    	int n = 1;
//    	int[] nums1 = new int[m+n];
//    	int[] nums2 = new int[n]; 
//    	nums1[0] = 2; nums1[1] = 0;
//    	nums2[0] = 1;
//    	test.merge(nums1, m, nums2, n);
    }
}
