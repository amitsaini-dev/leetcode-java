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
    public ListNode sortList(ListNode head) {

        //Base condition
        if(head==null || head.next==null){
            return head;
        }
        //Step 1: Find mid
        ListNode mid=findMid(head);
        
        //Step 2: call Merge Sort for left and right
        ListNode rightHead=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rightHead);

        //Step 3: Call
        return merge(left,right);
    }

    public static ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; // becomes mid
    }

    public static ListNode merge(ListNode left,ListNode right){
        //New Dummy node
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next=right;
                right=right.next;
                temp = temp.next;
            }
        }

        while(left!=null){
            temp.next=left;
            left=left.next;
            temp = temp.next;
        }

        while(right!=null){
            temp.next=right;
            right=right.next;
            temp = temp.next;
        }

        return dummy.next;
    }

}