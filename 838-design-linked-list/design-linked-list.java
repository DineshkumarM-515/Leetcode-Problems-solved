class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class MyLinkedList {
    int length;
    Node head;

    public MyLinkedList() {
        this.length = 0;
        this.head = null;
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.data;
    }

    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        length++;
    }

    public void addAtTail(int val) {
        if(head == null){
            addAtHead(val);
            return;
        }
        Node newnode = new Node(val);
        length++;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;

    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        if (index <= 0) {
            addAtHead(val);
        }
        else if(index == length){
            addAtTail(val);
        } else {
            Node newnode = new Node(val);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length){
            return;
        }
        Node temp = head;
        
        if (index == 0)
            head = head.next;
            
        else {
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            
        }
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */