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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevGroupEnd = null;
        ListNode newHead = null;

        while (temp != null) {

            ListNode check = temp;
            int cnt = 0;
            while (cnt < k && check != null) {
                check = check.next;
                cnt++;
            }
            if (cnt < k) break;

            ListNode t = temp;
            ListNode p = null;
            ListNode n = null;
            cnt = 0;

            while (cnt < k) {
                n = t.next;
                t.next = p;
                p = t;
                t = n;
                cnt++;
            }

            if (newHead == null) {
                newHead = p;
            }

            if (prevGroupEnd != null) {
                prevGroupEnd.next = p;
            }

            temp.next = t;
            prevGroupEnd = temp;
            temp = t;
        }

        if (prevGroupEnd != null) {
            prevGroupEnd.next = temp;
        }

        return newHead == null ? head : newHead;
    }
}