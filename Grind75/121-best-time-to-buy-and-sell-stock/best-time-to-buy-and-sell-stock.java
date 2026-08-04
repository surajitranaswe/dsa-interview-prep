class Solution {
    /**
     * Approach : Using Array Simulation Approach
     *
     * TC : O(n)
     * SC : O(1)
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) { // TC : O(n)
            int currentProfit = prices[i] - min;
            maxProfit = Math.max(maxProfit, currentProfit);
            // we will carry the minimum encountered value for next day
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
