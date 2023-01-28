package Stack_Queue;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {

        // It contains some inbuilt methods of stack

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        stack.push(6);

        System.out.println(stack);

        System.out.println(stack.size());

        System.out.println(stack.search(5));

        System.out.println(stack.search(4));

        System.out.println(stack.peek());
        System.out.println(stack.empty());

        System.out.println(stack.get(2));

        stack.clear();
        System.out.println(stack);
    }
}
