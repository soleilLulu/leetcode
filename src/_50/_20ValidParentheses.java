package _50;

import java.util.ArrayList;
import java.util.Stack;

/*
* @author:soleil
* @version 2018年2月13日 下午11:15:15
* 解释：Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
public class _20ValidParentheses {
//	public boolean isValid(String s) {
//		Stack<Character> save = new Stack<Character>();
//		if(s.length() == 0)return true;
//		
//		for(int i=0;i<s.length();i++){
//			char temp = s.charAt(i);
//			if(temp == '(' || temp == '{' || temp == '['){
//				save.push(temp);
//			}else if (save.isEmpty()){
//				return false;
//			}
//			else if(temp == ')' && save.pop() != '('){
//				return false;
//			}else if(temp == '}' && save.pop() != '{'){
//				return false;
//			}else if(temp == ']' && save.pop() != '['){
//				return false;
//			}
//		}
//		
////		这个部分写的太ugly，直接一句话搞定
////		if(save.isEmpty()){
////			return true;
////		}else{
////			return false;
////		}
//		
//		return save.isEmpty();
//
//	}
	public boolean isValid(String s) {
		Stack<Character> save = new Stack<Character>();
		if(s.length() == 0)return true;
		
		for(char c : s.toCharArray()){
			if(c == '('){
				save.push(')');
			}else if (c == '['){
				save.push(']');
			}else if (c == '{'){
				save.push('}');
			}else if (save.isEmpty() || c != save.pop()){
				return false;
			}
		}
		
		return save.isEmpty();
	}
}
