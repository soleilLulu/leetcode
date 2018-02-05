package Array;
/*
* @author:soleil
* @version 2018年2月2日 下午10:47:56
* 解释：Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: True

Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: False

Note:

    The input array won't violate no-adjacent-flowers rule.
    The input array size is in the range of [1, 20000].
    n is a non-negative integer which won't exceed the input array size.

*/
public class _605CanPlaceFlowers {
	//我的ugly方法
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//    	boolean res = true; 
//    	int count = 0;
//    	int length = flowerbed.length;
//    	
//    	if( n==0){
//    		return true;
//    	}
//    	
//    	if( n > length/2+1){
//    		return false;
//    	}
//    	
//    	if(length == 1){
//    		if(flowerbed[0] == 0 && n==1) return true;
//    		else return false;
//    	}
//    	
//    	if(flowerbed[0] == 0 &&  flowerbed[1] == 0){
//    		flowerbed[0] = 1;
//    		count ++;
//    	}
//    	
//    	
//    	for(int i=1;i<flowerbed.length-1;i++){
//    		if(flowerbed[i]==0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
//    			count++;
//    			flowerbed[i] = 1;
//    		}
//    	}
//    	
//    	if(flowerbed[length-1] == 0 &&  flowerbed[length-2]==0){
//    		count++;
//    	}
//    	
//    	if(count < n){
//    		res =false;
//    	}
//    	//System.out.println(count);
//        return res;
//    }
	
	//beautiful方法
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		//boolean res = false;
		int count = 0;
		
		for(int i=0;i<flowerbed.length && count < n;i++){
			if(flowerbed[i] == 0){
				int prev = (i == 0) ? 0 : flowerbed[i-1];
				int next = (i == flowerbed.length-1) ? 0 : flowerbed[i+1];
				if(prev == 0 && next == 0){
					flowerbed[i] = 1;
					count ++;
					
				}
			}
		}
		
		return count <= n;
	}
	
    public static void main(String[] args){
    	int[] flowerbed = {0,0,1,0,1};
    	_605CanPlaceFlowers test = new _605CanPlaceFlowers();
    	System.out.println(test.canPlaceFlowers(flowerbed, 1));
    }
}
