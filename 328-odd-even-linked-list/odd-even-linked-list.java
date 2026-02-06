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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode oddFirst = null , oddLast = null , evenFirst = null, evenLast = null;
        ListNode temp = head;
        int index = 1;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = null;
            if(index%2 == 0){
                if(evenFirst == null){
                    evenFirst = evenLast = temp;
                }
                else{
                    evenLast.next = temp;
                    evenLast = temp;
                }
            }
            else{
                if(oddFirst == null){
                    oddFirst = oddLast = temp;
                }
                else{
                    oddLast.next = temp;
                    oddLast = temp;
                }
            }
            index++;
            temp = next;
        }
        oddLast.next = evenFirst;
        return oddFirst;
    }
}