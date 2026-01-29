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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prevmid = null;

        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            prevmid = slow;
            slow = slow.next;
        }

        prevmid.next = null;

        ListNode curr = slow;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev =  curr;
            curr = next;
        }

        ListNode temp1 = head;
        ListNode temp2 = prev;
        while(temp1 != null && temp2 != null){
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;
            temp1.next = temp2;
            if(next1 == null) break;
            temp2.next = next1;
            temp1 = next1;
            temp2 = next2;
        }
        
    }
}