package _50;
/*
* @author:soleil
* @version 2018年3月7日 下午2:03:51
* 解释：Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.
*/
public class _12IntegertoRoman {
    public String intToRoman(int num) {
    	
    	if(num < 1)return "";
    	int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    	String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    	StringBuilder res = new StringBuilder();
    	
    	for(int i=0;i<numbers.length;i++){
    		while(num >= numbers[i]){
    			num -= numbers[i];
    			res.append(roman[i]);
    		}
    	}
    	
    	
        return res.toString();
    }
    
    public static void main(String[] args){
    	_12IntegertoRoman test = new _12IntegertoRoman();
    	test.intToRoman(999);
    }
}
