package ex1;

import java.util.Stack;

/**
 * 弹出最小值得栈
 * Created by bst on 2017/3/15.
 */
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum <= getMin()) {
            stackMin.push(newNum);
        }
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("your stack is empty");
        }
        int value = stackData.pop();
        if (value == getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("your stack is empty");
        }
        return stackMin.peek();
    }
}
