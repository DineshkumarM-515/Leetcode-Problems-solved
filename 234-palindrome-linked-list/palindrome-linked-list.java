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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode current = slow.next;
        slow.next = null;

        while(current != null){
            ListNode fwd = current.next;
            current.next = prev;
            prev = current;
            current = fwd;
        }

        while(prev != null){
            if(prev.val != head.val) return false;
            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}