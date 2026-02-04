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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        Set<Integer> remove = new HashSet<>();
        for(int num:nums){
            remove.add(num);
        }
        
        while(current != null){
            int data = current.val;
            if(remove.contains(data)){
                prev.next = current.next;
            }
            else{
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}