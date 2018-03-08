package _50;

import java.util.HashSet;

/*
* @author:soleil
* @version 2018年3月5日 下午12:15:52
* 解释：Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
*/
public class _8StringtoInteger_atoi {
    public int myAtoi(String str) {
    	//1.去掉所有空格
    	str = str.trim();
    	//2.去掉空字符串
    	if(str.length() == 0)return 0;
    	
    	int symbol = 1;
    	int index  = 0;
    	int total = 0;
    	
    	if(str.charAt(index) == '-'){
    		symbol = -1;
    		index ++;
    	}else if(str.charAt(index) == '+'){
    		index ++;
    	}
    	
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return symbol == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
    	
       
        return total * symbol;
    }
    public static void main(String[] args){
    	_8StringtoInteger_atoi test = new _8StringtoInteger_atoi();
    	//String test1 = "     ＋10000  ";
    	String test1 = "-2147483648";
    	System.out.println(test.myAtoi(test1));
    }
}
