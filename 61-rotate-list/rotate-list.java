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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        k = k % len;
        if(k == 0) return head;

        int newLen = len - k;
        ListNode curr = head;
        ListNode prev = null;
        for(int i=0;i<newLen;i++){
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        ListNode head2 = curr;
        ListNode tail = curr;
        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = head;

        return head2;
    }
}