package _50;
/*
* @author:soleil
* @version 2018年3月17日 下午1:27:11
* 解释： Divide two integers without using multiplication, division and mod operator.
If it is overflow, return MAX_INT. 
*/
public class _29DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
    	boolean isPositive = true;
    	
    	if((dividend < 0 && divisor >0) || (dividend > 0 && divisor < 0)){
    		isPositive = false;
    	}
    	
    	long ldividend = Math.abs((long)dividend);
    	long ldivisor = Math.abs((long)divisor);
    	
    	if(ldivisor == 0)return Integer.MAX_VALUE;
    	if(ldividend == 0)return 0;
    	
    	long lans = ldivide(ldividend, ldivisor);
    	
    	int ans;
    	if (lans > Integer.MAX_VALUE){ //Handle overflow.
    		ans = (isPositive)? Integer.MAX_VALUE : Integer.MIN_VALUE;
    	} else {
    		ans = (isPositive) ? (int)lans : -(int)lans;
    	}
    	return ans;
    }
    private long ldivide(long ldividend, long ldivisor) {
    	// Recursion exit condition
    	if (ldividend < ldivisor) return 0;
    	
    	//  Find the largest multiple so that (divisor * multiple <= dividend), 
    	//  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
    	//  Think this as a binary search.
    	long sum = ldivisor;
    	long multiple = 1;
    	while ((sum+sum) <= ldividend) {
    		sum += sum;
    		multiple += multiple;
    	}
    	//Look for additional value for the multiple from the reminder (dividend - sum) recursively.
    	return multiple + ldivide(ldividend - sum, ldivisor);
    }
    
    public static void main(String[] args){
    	_29DivideTwoIntegers test = new _29DivideTwoIntegers();
    	test.divide(-2147483648, -1);
    }
    
};
