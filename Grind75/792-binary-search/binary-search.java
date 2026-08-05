class Solution {
    /**
     * Approach : Using Binary Search Approach
     *
     * TC : O(log(n))
     * SC : O(1)
     */
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) { // TC : O(log(n))
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // target is in the left portion of mid
                high = mid - 1;
            } else {
                // target is in the right portion of mid
                low = mid + 1;
            }
        }
        return -1;
    }
}
