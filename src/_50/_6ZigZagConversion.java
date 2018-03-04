package _50;
/*
* @author:soleil
* @version 2018年3月4日 上午11:53:16
* 解释： The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". 
*/
public class _6ZigZagConversion {
    public String convert(String s, int numRows) {
    	if(numRows == 1 || s.length() < numRows)return s;
    	StringBuilder[] res = new StringBuilder[numRows];
    	int period = numRows*2 -2;
        for(int i=0;i<res.length;i++){
            res[i]=new StringBuilder("");
        }
    	
    	for(int i=0;i<s.length();i++){
    		int remainder = i % period ;   		
    		if(remainder > numRows-1){
    			res[period-remainder].append(s.charAt(i));
    			continue;
    		}
    		res[remainder] = res[remainder].append(s.charAt(i));
    	}
    	
    	String resStr = "";
    	for(StringBuilder str : res){
    		resStr += str;  		
    	}
    	
        return resStr;
    }
    public static void main(String[] args){
    	_6ZigZagConversion test = new _6ZigZagConversion();
    	String s = "PAYPALISHIRING";
    	//String result 
    	String res =test.convert(s, 3);
    	if(s.equals(res))System.out.println("success");
    }
}
