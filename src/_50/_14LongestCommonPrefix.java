package _50;
/*
* @author:soleil
* @version 2018年2月12日 下午2:17:18
* 解释：Write a function to find the longest common prefix string amongst an array of strings. 
* 找出string数组中所有string的最大公共前缀
*/
public class _14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length == 0)return "";
    	String prefix = strs[0];   	
    	if(strs.length ==1) return prefix;
    	
    	for(int i=1;i<strs.length;i++){
    		while(strs[i].indexOf(prefix) != 0){
    			prefix = prefix.substring(0, prefix.length()-1);
    		}
    	}
    	
    	return prefix;
    }
    
//    public int findCommonPrefix(String prefix,String str){
//    	int sameIndex = 0;
//    	int length = Math.min(prefix.length(), str.length());
//    	for(int i=0;i<length;i++){
//    		if(prefix.charAt(i) == str.charAt(i)){
//    			sameIndex ++;
//    		}else{
//    			break;
//    		}
//    	}
//    	return sameIndex;
//    }
    
    public static void main(String[] args){
    	_14LongestCommonPrefix test = new _14LongestCommonPrefix();
    	String[] strs = {"aa","a"};
    	System.out.println(test.longestCommonPrefix(strs));
    }
}
