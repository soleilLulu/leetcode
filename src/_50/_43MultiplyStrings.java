package _50;
/*
* @author:soleil
* @version 2018年3月23日 上午11:51:21
* 解释：Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
*/
public class _43MultiplyStrings {
	public String multiply(String num1, String num2) {
		int m = num1.length() ,n = num2.length();
		int[] posNum = new int[m+n];
		
		for(int i = m-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				int temp = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int p1 = i+j;
				int p2 = i+j+1;
				
				temp += posNum[p2];
				posNum[p1] += temp/10;
				posNum[p2] = temp % 10;
			}
		}
		
      StringBuilder sb = new StringBuilder();
      for(int p : posNum) if(!(sb.length() == 0 && p == 0)) sb.append(p);
      return sb.length() == 0 ? "0" : sb.toString();

	}
	
}
