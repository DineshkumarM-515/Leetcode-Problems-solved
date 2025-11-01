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
        ListNode ahead = new ListNode(0);
        ahead.next = head;
        ListNode prev = ahead;
        ListNode current = head;

        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        while(current != null){
            int data = current.val;
            if(set.contains(data)){
                prev.next = current.next;
                current = current.next;
            }
            else{
                prev = current;
                current = current.next;
            }
        }

        return ahead.next;
    }
}