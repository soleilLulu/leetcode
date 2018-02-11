package _50;
/*
* @author:soleil
* @version 2018年2月8日 下午1:16:29
* 解释：Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container and n is at least 2. 
*/
public class _11ContainerWithMostWater {
    public int maxArea(int[] height) {
    	int maxArea = 0;
    	int start = 0;
    	int end = height.length-1;
    	
    	while(start < end){
    		maxArea = Math.max(maxArea, Math.min(height[start], height[end])*(end-start));
    		if(height[start] < height[end]) start ++;
    		else end--;
    	}
    	
        return maxArea;
    }
    public static void main(String[] args){
    	_11ContainerWithMostWater test = new _11ContainerWithMostWater();
    	int[] height ={2,3,4,5,18,17,6};
    	System.out.println(test.maxArea(height));
    }
}
