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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            head.next = null;
            return head;
        }
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int pos = len-n;
        if(pos == 0){
            head = head.next;
            return head;
        }
        ListNode temp2 = head;
        for(int i=1;i<pos;i++){
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}