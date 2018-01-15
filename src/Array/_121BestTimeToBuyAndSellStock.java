package Array;
/*
* @author:soleil
* @version 2018年1月15日 下午9:49:45
* 解释：Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:

Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

Example 2:

Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.

*/
public class _121BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
    	int maxProfit = 0;
    	int minBuyPrice = 0;
    	
    	if(prices.length <= 1){
    		return 0;
    	}
    	
    	minBuyPrice = prices[0];
    	
    	for(int i=1;i<prices.length;i++){
    		int curPrice = prices[i];
    		if(curPrice < minBuyPrice){
    			minBuyPrice = curPrice;
    		}else if(curPrice - minBuyPrice > maxProfit){
    			maxProfit = curPrice - minBuyPrice;
    		}
    	}
    	
        return maxProfit;
    }
    
    public static void main(String[] args){
    	_121BestTimeToBuyAndSellStock test = new _121BestTimeToBuyAndSellStock();
    	int[] prices = {7, 6, 4, 3, 1};
    	System.out.println(test.maxProfit(prices));
    	
    }
}
