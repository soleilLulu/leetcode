package _50;
/*
* @author:soleil
* @version 2018年2月8日 下午4:48:08
* 解释：Given a 32-bit signed integer, reverse digits of an integer.
*/
public class _7ReverseInteger {
	 public int reverse(int x) {
		 long res = 0;
		 
		 while(x != 0){
			 int tail = x % 10;
			 res = res*10 + tail; 
			 if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
				 return 0;
			 }
			 x = x/10;
		 }
		 return (int)res;
	 }
	 
	 public static void main(String[] args){
		 _7ReverseInteger test = new _7ReverseInteger();
		 System.out.println(test.reverse(-2147483648));
	 }
}
