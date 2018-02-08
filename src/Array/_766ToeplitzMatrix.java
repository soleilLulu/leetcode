package Array;
/*
* @author:soleil
* @version 2018年2月7日 下午12:39:19
* 解释：A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
*/
public class _766ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
    	for(int i=0;i<matrix.length-1;i++){
    		for(int j=0;j<matrix[0].length-1;j++){
    			if(matrix[i][j] != matrix[i+1][j+1]){
    				return false;
    			}
    		}
    	}
    	
        return true;
    }
    
    public static void main(String[] args){
    	_766ToeplitzMatrix test = new _766ToeplitzMatrix();
    	int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
    	System.out.println(test.isToeplitzMatrix(matrix));
    }
}
