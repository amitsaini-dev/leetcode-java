/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        //detect cycle 
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //if cycle detected than make slow=head and move fast slow by one at point they meet is the node we need to return
            
            //When fast==slow than fast.prev is the last node
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                    
                }
                return slow;
            }
        }
        //if no cycle return null
        return null; 
    }
}