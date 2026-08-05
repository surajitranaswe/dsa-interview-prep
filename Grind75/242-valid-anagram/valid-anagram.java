class Solution {
    /**
     * Approach : Using Hashing Approach
     *
     * TC : O(m) + O(n) + O(26) ~ O(m + n)
     * SC : O(26) ~ O(1)
     */
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] freq = new int[26];     // SC : O(26)
        for (int i = 0; i < m; i++) { // TC : O(m)
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) { // TC : O(n)
            freq[t.charAt(i) - 'a']--;
        }
        /**
         * if String 's' and 't' are anagrams then all 
         * elements in array 'freq' will be 0
         */
        for (int i = 0; i < 26; i++) { // TC : O(26)
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
