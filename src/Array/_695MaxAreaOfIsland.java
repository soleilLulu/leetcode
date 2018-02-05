package Array;
/*
* @author:soleil
* @version 2018年2月5日 下午2:21:18
* 解释：Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
Example 2:
[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.
Note: The length of each dimension in the given grid does not exceed 50. 
*/
public class _695MaxAreaOfIsland {
    int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}}; 
	
    public int maxAreaOfIsland(int[][] grid) {
    	int rows = grid.length;
    	int cols = grid[0].length;
    	
        int maxArea = 0;
        int currArea = 0;

        
        for(int row=0;row<rows;row++){
        	for(int col=0;col<cols;col++){
        		if(grid[row][col] == 1){
        			grid[row][col] = 0;
        			currArea = findArea(grid,row,col);
        			maxArea = Math.max(currArea, maxArea);
        		}
        	}
        }
        
        return Math.max(maxArea, currArea);
    }
    
    //
    public int findArea(int[][] grid,int x,int y){
    	int area = 1;

    	for(int[] direction : directions){
    		int newX = x+direction[0];
    		int newY = y+direction[1];
    	
    		if( newX>=0 && newX < grid.length && newY >=0 && newY < grid[0].length){
        		if(grid[newX][newY] == 1){
        			//System.out.println("当前坐标"+"x:"+newX+"y:"+newY);
        			grid[newX][newY] = 0;
        			area += findArea(grid,newX,newY);
        			
        		}
    		}
    	}
    	
    	return area;
    }
    
    
    public static void main(String[] args){
    	_695MaxAreaOfIsland test = new _695MaxAreaOfIsland();
    	int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
    			 {0,0,0,0,0,0,0,1,1,1,0,0,0},
    			 {0,1,1,0,1,0,0,0,0,0,0,0,0},
    			 {0,1,0,0,1,1,0,0,1,0,1,0,0},
    			 {0,1,0,0,1,1,0,0,1,1,1,0,0},
    			 {0,0,0,0,0,0,0,0,0,0,1,0,0},
    			 {0,0,0,0,0,0,0,1,1,1,0,0,0},
    			 {0,0,0,0,0,0,0,1,1,0,0,0,0}};   

    	System.out.println(test.maxAreaOfIsland(grid));
    }
}
