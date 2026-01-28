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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        ListNode temp1 = head;
        ListNode temp2 = prev;
        int maxTwinSum = 0;
        while(temp1 != null && temp2 != null){
            int data1 = temp1.val;
            int data2 = temp2.val;
            int currentTwinSum = data1+data2;
            if(currentTwinSum > maxTwinSum){
                maxTwinSum = currentTwinSum; 
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return maxTwinSum;
    }
}