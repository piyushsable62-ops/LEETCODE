class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int value) {
        st.push(value);

        if (min.isEmpty() || value <= min.peek()) {
            min.push(value);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            if (st.peek().equals(min.peek())) {
                min.pop();
            }
            st.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        return 0;
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        return 0;
    }
}