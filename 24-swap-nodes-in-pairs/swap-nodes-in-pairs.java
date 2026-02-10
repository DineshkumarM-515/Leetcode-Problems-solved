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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        head = head.next;
        while(curr != null && curr.next != null){
            ListNode next1 = curr.next;
            ListNode next2 = curr.next.next;
            
            next1.next = curr;
            curr.next = next2;

            if(prev != null){
                prev.next = next1;
            }
            prev = curr;
            curr = next2;
        }
        return head;
    }
}