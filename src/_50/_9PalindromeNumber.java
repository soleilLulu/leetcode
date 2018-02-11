package _50;
/*
* @author:soleil
* @version 2018年2月9日 下午10:53:27
* 解释：Determine whether an integer is a palindrome. Do this without extra space.
*/
public class _9PalindromeNumber {
	//错误：不能有extra space
//	public boolean isPalindrome(int x) {
//		String strX = String.valueOf(x);
//		int length = strX.length();
//		for(int i=0;i<strX.length();i++){
//			if(strX.charAt(i) != strX.charAt(length-1-i)){
//				return false;
//			}
//		}	
//		
//		return true;
//	}
	
	public boolean isPalindrome(int x){
		if(x < 0 || x !=0 && x %10 ==0) return false;
		int res = 0;
		
		while(x > res){
			res = res*10+x%10;
			x = x/10;
		}
		
		return(x==res || x == res/10);
		
	}

}
