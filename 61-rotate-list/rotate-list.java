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

        ListNode temp = head;
        int n = 0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        k = k % n;
        if(k == 0) return head;

        temp = head;
        ListNode prev = head;

        for(int i=0;i<n-k;i++){
            prev = temp;
            temp = temp.next;
        }

        ListNode tail = temp;
        while(tail.next != null){
            tail = tail.next;
        }

        prev.next = null;
        tail.next = head;
        if(k != 0) head = temp;

        return head;
    }
}