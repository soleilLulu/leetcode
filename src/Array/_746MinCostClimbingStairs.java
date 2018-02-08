package Array;
/*
* @author:soleil
* @version 2018年2月6日 下午9:11:09
* 解释： On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1. 
*/
public class _746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
    	int minCost[] = new int[cost.length+1];
    	minCost[0] = cost[0];
    	minCost[1] = cost[1];
    			
    	for(int i=2;i<=cost.length;i++){
    		int costV = (i == cost.length) ? 0 : cost[i];
    		minCost[i] = Math.min(minCost[i-1]+costV, minCost[i-2]+costV);
    	}
    	
        return minCost[cost.length];
    }
    
    public static void main(String[] args){
    	_746MinCostClimbingStairs test = new _746MinCostClimbingStairs();
    	int[] cost = {10, 15, 20};
    	System.out.println(test.minCostClimbingStairs(cost));
    }
}
