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
            // compare and store the maximum profit with profit made at index 'i'
            maxProfit = Math.max(maxProfit, prices[i] - min);
            // we will carry the minimum encountered value for next day
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
