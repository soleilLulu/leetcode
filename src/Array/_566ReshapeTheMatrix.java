package Array;
/*
* @author:soleil
* @version 2018年2月1日 下午3:17:01
* 解释：In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
Note:
    The height and width of the given matrix is in range [1, 100].
    The given r and c are all positive.
*/
public class _566ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	if(nums == null || nums.length == 0 || r*c != nums.length*nums[0].length) return nums;
    	int heightIndex = 0;
    	int widthIndex = 0;
    	//保存结果数组
        int[][] res = new int[r][c];
        for(int i =0;i<nums.length;i++){
        	for(int j=0;j<nums[0].length;j++){
        		res[heightIndex][widthIndex] = nums[i][j];
        		widthIndex ++;
        		if(widthIndex == c){
        			heightIndex ++;
        			widthIndex = 0;
        		}
        	}
        }
        return res;
    }
    public static void main(String[] args){
    	_566ReshapeTheMatrix test = new _566ReshapeTheMatrix();
    	int[][] nums = {{1,2},{3,4}};
    	test.matrixReshape(nums, 1, 4);
    }
}
