package _50;
/*
* @author:soleil
* @version 2018年2月24日 上午11:49:36
* 解释：Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
*/
public class _5LongestPalindromicSubstring {
	private int maxLen,low;
	
	public String longestPalindrome(String s){
		int length = s.length();
		if(length < 2)return s;
		
		for(int i=0;i<length-1;i++){
			extendPalindorme(s,i,i);
			extendPalindorme(s,i,i+1);
		}
		//System.out.println(low+","+maxLen);
		return s.substring(low,low+maxLen);
	}
	
	public void extendPalindorme(String s,int begin,int end){
		while(begin >= 0 && end < s.length() && (s.charAt(begin)== s.charAt(end))){
			begin --;
			end ++;
		}
		if(maxLen < end-begin-1){
			low = begin+1;
			maxLen = end-begin-1;
		}
	}

    public static void main(String[] args){
    	_5LongestPalindromicSubstring test = new _5LongestPalindromicSubstring();
    	String s = "babad";
    	//System.out.println(test.isPalindrome("baab"));
    	System.out.println(test.longestPalindrome(s));
    }
}
