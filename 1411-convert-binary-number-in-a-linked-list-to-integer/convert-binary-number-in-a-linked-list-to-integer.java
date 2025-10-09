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
    public int getDecimalValue(ListNode head) {
        String num = "";
        ListNode temp = head;
        while(temp != null){
            num += Integer.toString(temp.val);
            temp = temp.next;
        }
        
        int dec = 0;
        int power = 0;
        for(int i=num.length()-1;i>=0;i--){
            char dig = num.charAt(i);
            if(dig == '1') dec += Math.pow(2,power);
            power++;
        }

        return dec;
    }
}