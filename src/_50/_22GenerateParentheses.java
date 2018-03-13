package _50;

import java.util.ArrayList;
import java.util.List;

/*
* @author:soleil
* @version 2018年3月13日 上午9:15:20
* 解释： Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses. 
*/
public class _22GenerateParentheses {
	 public List<String> generateParenthesis(int n) {
	        List<String> ans = new ArrayList();
	        backtrack(ans, "", 0, 0, n);
	        return ans;
	    }

	    public void backtrack(List<String> ans, String cur, int open, int close, int max){
	        if (cur.length() == max * 2) {
	            ans.add(cur);
	            System.out.println(cur);
	            return;
	        }

	        if (open < max)
	            backtrack(ans, cur+"(", open+1, close, max);
	        if (close < open)
	            backtrack(ans, cur+")", open, close+1, max);
	    }
    
    public static void main(String[] args){
    	_22GenerateParentheses test = new _22GenerateParentheses();
    	test.generateParenthesis(3);
    }
}
