package meituan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
* @author:soleil
* @version 2018年3月22日 下午8:19:57
* 解释：
*/
public class leetcode {
	
	
	public void doSort(String[] inputStr){
		
		HashMap<String,Integer> strMap = new HashMap<String,Integer>();
		//先算出难度
		for(int i=0;i<inputStr.length;i++){
			String[] temp = inputStr[i].split("\\s+");
			int divider = Integer.parseInt(temp[1]);
			int dividen = Integer.parseInt(temp[2]);
			int result = (dividen*10)/divider;
			
			//判断难度范围
			if(result >6){
				strMap.put(temp[0],3);
			}else if(result > 3){
				strMap.put(temp[0], 4);
			}else{
				strMap.put(temp[0], 5);
			}
		}
		
		//字典序排序
		Arrays.sort(inputStr);
		
		//按字典序输出
		for(String str : inputStr){
			String key = str.split("\\s+")[0];
			System.out.println(key+" "+strMap.get(key));
		}
		
	}
	
	public static void main(String[] args){
		leetcode test = new leetcode();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] strs = new String[n];
		int index=0;
		
		while(scan.hasNext()){
			String temp = scan.nextLine();
			strs[index] = temp;	
			index ++;
		}
//		
//		for(int i=0;i<n;i++){
//			String temp = scan.nextLine();
//			strs[i] = temp;
//		}
		scan.close();
		
		test.doSort(strs);		
	}
}
