package meituan;

import java.util.Scanner;

/*
* @author:soleil
* @version 2018年3月22日 下午8:18:41
* 解释：
*/
public class game {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String temp = scan.next();
		int n = Integer.parseInt(temp);
		System.out.println(2*n-3);
	}
}
