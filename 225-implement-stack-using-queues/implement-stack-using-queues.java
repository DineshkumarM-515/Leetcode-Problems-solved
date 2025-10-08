class MyStack {
    int[] queue;
    int top;
    public MyStack() {
        queue = new int[9];
        top = 0;
    }
    
    public void push(int x) {
        if(top >= queue.length) return;
        queue[top] = x;
        top++;
    }
    
    public int pop() {
        if(empty()) return -1;
        top--;
        return queue[top];
    }
    
    public int top() {
        if(empty()) return 0;
        return queue[top-1];
    }
    
    public boolean empty() {
        return top == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */