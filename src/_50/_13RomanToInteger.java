package _50;

import java.util.HashMap;

/*
* @author:soleil
* @version 2018年2月10日 上午9:20:41
* 解释：Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
*/
public class _13RomanToInteger {
	
	public int romanToInt(String s) {
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		int res = 0;
		insertMap(count);
		for(int i=0;i<s.length()-1;i++){
			if(count.get(s.charAt(i)) < count.get(s.charAt(i+1))){
				res = res - count.get(s.charAt(i));
			}else{
				res = res + count.get(s.charAt(i));
			}
		}
		res = res + count.get(s.charAt(s.length()-1));

		return res;
	}
	public HashMap<Character,Integer> insertMap(HashMap<Character,Integer> count){
		count.put('I', 1);
		count.put('V', 5);
		count.put('X', 10);
		count.put('L', 50);
		count.put('C', 100);
		count.put('D', 500);
		count.put('M', 1000);
		return count;
	}
	
	
	public static void main(String[] args){
		_13RomanToInteger test = new _13RomanToInteger();
		System.out.println(test.romanToInt("DCXXI"));
	}
}
