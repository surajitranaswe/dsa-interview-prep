class Solution {
    /**
     * Approach II : Using Deque + String Simulation Approach
     *
     * TC : O(n)
     * SC : O(n)
     */
    public boolean isValid(String s) {
        int n = s.length();
        Deque<Character> deque = new ArrayDeque<>(); // SC : O(n)
        for (int i = 0; i < n; i++) { // TC : O(n)
            char ch = s.charAt(i);    // TC : O(1)
            if (isOpenBracket(ch)) {
                deque.push(ch);
            } else {
                if (deque.isEmpty()) {
                    /**
                     * if close bracket appears before 
                     * any open brackets then String 's'
                     * will always be invalid
                     */
                    return false;
                }
                char last = deque.peek();
                if (last == getOpenBracketForClosed(ch)) { // TC : O(1)
                    deque.pop();
                } else {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }

    /**
     * Approach I : Using Stack + String Simulation Approach
     *
     * TC : O(n)
     * SC : O(n)
     */
    public boolean isValidUsingStack(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>(); // SC : O(n)
        for (int i = 0; i < n; i++) { // TC : O(n)
            char ch = s.charAt(i);    // TC : O(1)
            if (isOpenBracket(ch)) {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    /**
                     * if close bracket appears before 
                     * any open brackets then String 's'
                     * will always be invalid
                     */
                    return false;
                }
                char last = st.peek();
                if (last == getOpenBracketForClosed(ch)) { // TC : O(1)
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    /**
     * Using String Enumeration Approach
     *
     * TC : O(1)
     * SC : O(1)
     */
    private boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    /**
     * Using String Enumeration Approach
     *
     * TC : O(1)
     * SC : O(1)
     */
    private char getOpenBracketForClosed(char ch) {
        if (ch == ')') {
            return '(';
        } else if (ch == '}') {
            return '{';
        } else {
            return '[';
        }
    }
}
