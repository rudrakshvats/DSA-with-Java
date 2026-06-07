package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private Deque<Integer> deque;
    private Deque<Integer> minDeque;

    public MinStack() {
        deque = new ArrayDeque<>();
        minDeque = new ArrayDeque<>();
    }

    public void push(int value) {
        deque.push(value);
        if (minDeque.isEmpty()) minDeque.push(value);
        else {
            int minVal = minDeque.peek();
            if (minVal <= value) minDeque.push(minVal);
            else minDeque.push(value);
        }
    }

    public void pop() {
        deque.pop();
        minDeque.pop();
    }

    public int top() {
        return deque.peek();
    }

    public int getMin() {
        return minDeque.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
