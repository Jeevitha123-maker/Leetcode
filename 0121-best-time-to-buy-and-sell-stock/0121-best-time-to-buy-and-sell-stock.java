class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = Integer.MIN_VALUE;
        int var = prices[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            int maxElement = var;
            profit = Math.max(profit, maxElement - prices[i]);
            if (prices[i] > var) var = prices[i];
        }
        return profit;
    }
}