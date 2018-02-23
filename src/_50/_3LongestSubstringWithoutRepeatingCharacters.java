package _50;
/*
* @author:soleil
* @version 2018年2月23日 下午9:58:47
* 解释：Given a string, find the length of the longest substring without repeating characters.
*/
public class _3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
    	int max = 0;
    	String temp = "";
    	
    	for(char c : s.toCharArray()){
    		int index = temp.indexOf(c);
    		if(index < 0) temp += c;
    		else{
    			max = (temp.length() > max) ? temp.length() : max ;
    			temp = temp.substring(index+1);
    			temp += c;
    		}
    	}
    	max = (temp.length() > max) ? temp.length() : max;
        return max;
    }
    
    public static void main(String[] args){
    	_3LongestSubstringWithoutRepeatingCharacters test = new _3LongestSubstringWithoutRepeatingCharacters();
    	String s = "abcabcbb";
    	System.out.println(test.lengthOfLongestSubstring(s));
    }
}
