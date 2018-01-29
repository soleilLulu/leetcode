package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
* @author:soleil
* @version 2018年1月29日 下午9:02:08
* 解释：Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. 
*/
public class _217ContainsDuplicate {
	//两个方法，一个选择用hashmap来存储遍历过的值，再进行判断??? 似乎觉得这里可以用一个新的数组然后直接数组查找？？？数组并非可变长度－>用arraylist
	//另一个方法是先对数组进行排序，再看前后相邻的元素有没有重复的
	
/*解法一：用hashmap,16.1
 */
//    public boolean containsDuplicate(int[] nums) {
//    	int length = nums.length;
//    	if(length <= 1){
//    		return false;
//    	} 	
//    	HashMap<Integer,Integer> count = new HashMap<Integer, Integer>();
//    	count.put(nums[0], 1);
//    	
//    	for(int i = 1;i<nums.length;i++){
//    		int tempKey = nums[i];
//    		if(count.get(tempKey) != null ){
//    			return true;
//    		}else{
//    			count.put(tempKey, 1);
//    		}
//    	}
//    	
//        return false;
//    }
	/*解法二：在方法一的基础上改用arraylist 未通过 超时
	 */
//  public boolean containsDuplicate(int[] nums) {
//	int length = nums.length;
//	if(length <= 1){
//		return false;
//	} 	
//	ArrayList<Integer> count = new ArrayList<Integer>();
//	count.add(nums[0]);
//	
//	for(int i = 1;i<nums.length;i++){
//		int tempKey = nums[i];
//		if(count.contains(tempKey)){
//			return true;
//		}else{
//			count.add(tempKey);
//		}
//	}
//	
//    return false;
//}
	/*解法三： 先排序再找重复 86%
	 */ 
	public boolean containsDuplicate(int[] nums) {
		int length = nums.length;
		if(length <= 1){
			return false;
		} 
		Arrays.sort(nums);
		for(int i=0 ;i<length-1;i++){
			if(nums[i] == nums[i+1]){
				return true;
			}
		}
		return false;
	}
  
}
