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
         ListNode temp = head, prev = null;

        while (temp != null) {
            ListNode kth = temp;

            // Find kth node
            for (int i = 1; i < k && kth != null; i++)
                kth = kth.next;

            if (kth == null){
                if(prev!=null)
                   prev.next=temp;
                break;
            }

            ListNode next = kth.next;

            // Reverse k nodes
            ListNode p = null, curr = temp;
            while (curr != next) {
                ListNode n = curr.next;
                curr.next = p;
                p = curr;
                curr = n;
            }

            if (prev == null)
                head = kth;
            else
                prev.next = kth;

            prev = temp;
            temp = next;
        }

        return head;
        
    }
}