package _50;

import java.util.HashSet;

/*
* @author:soleil
* @version 2018年3月18日 下午12:26:00
* 解释：Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
*/
public class _36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
    	boolean res = true;
    	int length = 9;
    	
    	//判断行
    	for(int i=0;i<length;i++){
    		HashSet<Character> temp = new HashSet<Character>();
    		for(char c : board[i]){
    			if(c != '.'){
    				if(!temp.add(c)){
    					return false;
    				}
    			}
    		}
    	}
    	
    	//判断列
    	for(int i=0;i<length;i++){
    		HashSet<Character> temp = new HashSet<Character>();
    		for(int j=0;j<length;j++){
    			char c = board[j][i];
    			if(c != '.'){
    				if(!temp.add(c)){
    					return false;
    				}
    			}   			
    		}
    	}
    	
    	//判断方块
    	int[][] center = {{1,1},{1,4},{1,7},{4,1},{4,4},{4,7},{7,1},{7,4},{7,7}};
    	int[][] directs = {{-1,-1},{-1,0},{1,0},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
    	
    	for(int[] a :center){
    		HashSet<Character> temp = new HashSet<Character>();
    		for(int[] direct : directs){
    			char c =board[direct[0]+a[0]][direct[1]+a[1]];
    			if(c != '.'){
    				if(!temp.add(c)){
    					return false;
    				}
    			}  
    		}
    	}

    	
        return res;
    }  
    
}
