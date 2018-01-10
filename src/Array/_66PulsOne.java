package Array;
/*
* @author:soleil
* @version 2018年1月10日 下午12:38:20
* 解释：Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
You may assume the integer do not contain any leading zero, except the number 0 itself.
The digits are stored such that the most significant digit is at the head of the list.
*/
public class _66PulsOne {
	
	public int[] plusOne(int[] digits){
		int carry = 1;	
		
		for(int i=digits.length-1;i>=0;i--){
			if(digits[i] + carry == 10){
				digits[i] = 0;
				carry = 1;
			}else{
				digits[i] = digits[i] + carry; 
				return digits;
			}			
			
		}
		
		int[] res = new int[digits.length+1];
		res[0] = 1;
		return res;
		
	}
	
	public static void main(String[] args){
		_66PulsOne test = new _66PulsOne();
		int[] digits = {1,0};
		//int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int[] result =test.plusOne(digits);
		String str = "";
		for(int i=0;i<result.length;i++){
			str += result[i];
		}
		System.out.println(str);
	}

}
