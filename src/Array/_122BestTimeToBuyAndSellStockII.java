package Array;
/*
* @author:soleil
* @version 2018年1月16日 下午2:08:20
* 解释：Say you have an array for which the ith element is the price of a given stock on day i.
Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
(ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).
*/
public class _122BestTimeToBuyAndSellStockII {
	
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int buyPrice = 0;
        int curProfit = 0;
        
    	if(prices.length <= 1){
    		return 0;
    	}
    	
    	buyPrice = prices[0];
    	for(int i=1;i<prices.length;i++){
    		if(prices[i] - buyPrice > curProfit ){
    			curProfit = prices[i] - buyPrice;
    		}else{
    			buyPrice = prices[i];
    			maxProfit += curProfit;
    			curProfit = 0;
    		}
    		
    	}
    	maxProfit += curProfit;
        
        return maxProfit;
    }
    
    public static void main(String[] args){
    	_122BestTimeToBuyAndSellStockII test = new _122BestTimeToBuyAndSellStockII();
    	int[] prices = {7,1,5,3,6,4};
    	System.out.println(test.maxProfit(prices));
    }
}
