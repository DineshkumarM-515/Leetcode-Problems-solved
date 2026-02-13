/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> copyList = new HashMap<>();
        Node curr = head;
        while(curr != null){
            Node newnode = new Node(curr.val);
            copyList.put(curr,newnode);
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            Node copyNode = copyList.get(curr);
            copyNode.next = copyList.get(curr.next);
            copyNode.random = copyList.get(curr.random);
            curr = curr.next;
        } 
        return copyList.get(head);
    }
}