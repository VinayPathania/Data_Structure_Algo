package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImpl {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        dq.add(6);

        System.out.println(dq);
        dq.remove();

        dq.addFirst(1);
        dq.addLast(7);

        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
