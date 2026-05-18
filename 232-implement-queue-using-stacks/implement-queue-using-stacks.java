class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        Stack<Integer> st2 = new Stack<>();

        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        int popped = st2.pop();

        while(!st2.isEmpty()){
            st.push(st2.pop());
        }

        return popped;
    }
    
    public int peek() {
        Stack<Integer> st2 = new Stack<>();

        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        int peek = st2.peek();

        while(!st2.isEmpty()){
            st.push(st2.pop());
        }

        return peek;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */