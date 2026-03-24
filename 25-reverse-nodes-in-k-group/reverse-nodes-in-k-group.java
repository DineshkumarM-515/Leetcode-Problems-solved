class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGrpTail = dummy;
        ListNode curr = head;
        while(curr != null){

            ListNode tracker = prevGrpTail.next;
            for(int i=0;i<k;i++){
                if(tracker == null) return dummy.next;
                tracker = tracker.next;
            }

            ListNode prev = null;
            ListNode next = null;
            ListNode grpStart = curr;
            int count = 0;
            while(curr != null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            prevGrpTail.next = prev;
            grpStart.next = curr;
            prevGrpTail = grpStart; 
        } 

        return dummy.next;
    }
}