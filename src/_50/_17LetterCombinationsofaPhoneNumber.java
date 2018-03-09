package _50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
* @author:soleil
* @version 2018年3月9日 下午3:53:57
* 解释：Given a digit string, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.
*/

public class _17LetterCombinationsofaPhoneNumber {
	
    public List<String> letterCombinations(String digits) {
    	LinkedList<String> res = new LinkedList<String>(); 
    	if(digits.length() == 0){
    		return res;
    	}
    	String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};   	
    	res.add("");
    	
    	for(int i=0;i<digits.length();i++){
    		int index = Character.getNumericValue(digits.charAt(i));
    		while(res.peek().length() == i){
    			String temp = res.remove();
    			for(char c : mapping[index].toCharArray()){
    				res.add(temp+c);
    			}
    		}
    		
    	}  	
    	
		return res;
    }
    public static void main(String[] args){
    	String digits = "23";
    	_17LetterCombinationsofaPhoneNumber test = new _17LetterCombinationsofaPhoneNumber();
    	test.letterCombinations(digits);
    }
}
