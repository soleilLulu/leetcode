package Array;
/*
* @author:soleil
* @version 2018年2月4日 下午5:30:01
* 解释：Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.
*/
public class _661ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
    	if(M == null)return null;
    	int rows = M.length;
    	if(rows == 0)return new int[0][];
    	
    	int cols = M[0].length;
    	
    	int[][] res = new int[rows][cols];
    	
    	for(int row=0;row<rows;row++){
    		for(int col =0;col < cols;col++){
        		int count = 0;
        		int sum = 0;
        		for(int incR : new int[]{-1,0,1}){
        			for(int incC : new int[]{-1,0,1}){
        				if(isValid(rows,cols,row+incR,col+incC)){
        					count++;
        					sum += M[row+incR][col+incC];
        				}
        			}
        		}
        		res[row][col] = sum/count;
        	}	
    	}

        return res;
    }
	
    public boolean isValid(int row,int col,int x,int y){
		return x >= 0 && x < row && y >= 0 && y < col;
    	
    }
    
    
}
