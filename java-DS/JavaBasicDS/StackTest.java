package JavaBasicDS;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.search(30));
        System.out.println(stack.size());
    }
}
