package _50;

import java.nio.charset.Charset;

/*
* @author:soleil
* @version 2018年2月19日 下午9:36:54
* 解释：The count-and-say sequence is the sequence of integers with the first five terms as following:
1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.
Note: Each term of the sequence of integers will be represented as a string. 
*/
public class _38CountAndSay {
	
	public String countAndSay(int n) {
		String prev = "1";
		String curr = "1";
		
		for(int i=1;i<n;i++){
			curr = speak(prev);
			prev = curr;
		}
		
		return curr;
	}
	
	public String speak(String str){
		int count = 1;
		Character say = str.charAt(0);
		int length = str.length();
		String res = "";
		
		for(int i=1;i<length;i++){
			Character temp = str.charAt(i);
			if(temp == say)count++;
			else{
				res = res + Integer.toString(count) + say;
				say = temp; 
				count = 1;
			}
		}
		
		return  res + String.valueOf(count) + say;
	}
//    public String countAndSay(int n) {
//    	StringBuilder curr=new StringBuilder("1");
//    	StringBuilder prev;
//    	int count;
//    	char say;
//        for (int i=1;i<n;i++){
//        	prev=curr;
// 	        curr=new StringBuilder();       
// 	        count=1;
// 	        say=prev.charAt(0);
// 	        
// 	        for (int j=1,len=prev.length();j<len;j++){
// 	        	if (prev.charAt(j)!=say){
// 	        		curr.append(count).append(say);
// 	        		count=1;
// 	        		say=prev.charAt(j);
// 	        	}
// 	        	else count++;
// 	        }
// 	        curr.append(count).append(say);
//        }	       	        
//        return curr.toString();
//}
    
    public static void main(String[] args){
    	_38CountAndSay test = new _38CountAndSay();
    	System.out.println("结果"+test.countAndSay(4));  	
    	//System.out.println(test.speak("1"));
    }
}
