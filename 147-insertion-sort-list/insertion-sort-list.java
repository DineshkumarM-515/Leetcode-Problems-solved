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
    public static ListNode sortedIndex(ListNode sorted,ListNode newnode){
        if(sorted == null || sorted.val > newnode.val){
            newnode.next = sorted;
            return newnode;
        }

        else{
            ListNode curr = sorted;
            while(curr.next != null && curr.next.val < newnode.val){
                curr = curr.next;
            }
            newnode.next = curr.next;
            curr.next = newnode;
            return sorted;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode sorted = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            sorted = sortedIndex(sorted,current);
            current = next;
        }
        return sorted;
    }
}