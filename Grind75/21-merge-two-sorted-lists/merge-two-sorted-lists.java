/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /**
     * Approach II : Using Recursion Approach
     *
     * TC : O(m + n)
     * SC : O(m + n)
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base Case
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        // Recursion Calls
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    /**
     * Approach I : Using Brute-Force (Two Pointers) Approach
     *
     * TC : O(m) + O(n) ~ O(m + n)
     * SC : O(1)
     */
    public ListNode mergeTwoListsTwoPointers(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        ListNode p = list1; // pointer at the start of ListNode 'list1'
        ListNode q = list2; // pointer at the start of ListNode 'list2'
        while (p != null && q != null) { // TC : O(m) + O(n)
            if (p.val <= q.val) {
                current.next = p;
                p = p.next;
            } else {
                current.next = q;
                q = q.next;
            }
            current = current.next;
        }
        while (p != null) {
            current.next = p;
            current = current.next;
            p = p.next;
        }
        while (q != null) {
            current.next = q;
            current = current.next;
            q = q.next;
        }
        return dummy.next;
    }
}
