package meituan;

import java.util.Scanner;

/*
* @author:soleil
* @version 2018年3月23日 下午9:37:15
* 解释：
*/
public class magicStone {
	
	//获取两个点间的距离
	public double getDis(int x1,int y1,int x2,int y2){
		 return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)); 
	}
	
	public static void main(String[] args){
		magicStone test = new  magicStone();
		Scanner sc = new Scanner(System.in);
		int group = sc.nextInt();
		int[][] pos = new int[group*2][4];
		
		//把输入转换为数组
		for(int i=0;i<group*3;i++){
			for(int j=0;j<4;j++){
				pos[i][j] = sc.nextInt();
			}
		}
		
		//存储最终结果
		String[] res = new String[group];
		double[] len = new double[4];
		
		for(int i=0;i<group*2;i+=2){
			len[i/2] = test.getDis(pos[i][0],pos[i+1][0],pos[i][1],pos[i+1][1]);	
		}
		
		
	}

}
