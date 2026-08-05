class Solution {
    /**
     * Approach : Using Two Pointers Approach
     *
     * TC : O(n) + O(n / 2) ~ O(n)
     * SC : O(n)
     */
    public boolean isPalindrome(String s) {
        int n = s.length();
        List<Character> sList = new ArrayList<>(); // SC : O(n)
        for (int i = 0; i < n; i++) { // TC : O(n)
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                sList.add(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                sList.add((char) (ch + 32));
            }
        }
        int p = 0;
        int q = sList.size() - 1;
        while (p < q) { // TC : O(n / 2)
            if (sList.get(p) != sList.get(q)) {
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}
