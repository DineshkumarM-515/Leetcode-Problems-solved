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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        ListNode temp1 = head;
        for(int i=0;i<k-1;i++){
            temp1 = temp1.next;
        }

        ListNode temp2 = head;
        for(int i=0;i<count-k;i++){
            temp2 = temp2.next;
        }

        int temp3 = temp1.val;
        temp1.val = temp2.val;
        temp2.val = temp3;

        return head;
    }
}