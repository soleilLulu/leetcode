package _50;
/*
* @author:soleil
* @version 2018年2月22日 下午6:27:25
* 解释：You are given an n x n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise).
*/
public class _48RotateImage {
	
	//先将上下翻转，再沿对角线翻转
    public void rotate(int[][] matrix) {
    	int height = matrix.length;
    	int width = matrix[0].length;
    	//上下翻转
    	for(int i=0;i<height/2;i++){
    		for(int j=0;j<width;j++){
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[height-i-1][j];
    			matrix[height-i-1][j] = temp;
    		}
    	}
    	//沿对角线翻转
    	for(int i=0;i<height;i++){
    		for(int j=i;j<width;j++){
    			int temp = matrix[i][j];
    			//System.out.println(temp);
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] =  temp;
    		}
    	}
        return;
    }
    
    public static void main(String[] args){
    	_48RotateImage test = new _48RotateImage();
    	int[][] matrix = {{1,2,3},
    	                   {4,5,6},
    	                   {7,8,9}};
    	test.rotate(matrix);
    	for(int i=0;i<matrix.length;i++){
    		for(int j=0;j<matrix[0].length;j++){
    			System.out.print(matrix[i][j]);
    		}
    		System.out.println();
    	}
    }
}
