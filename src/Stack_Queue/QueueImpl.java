package Stack_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {

        // It works on the principle of FIFO (First In First Out)

        Queue<Integer> que = new PriorityQueue<>();

        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);

        System.out.println(que);
        System.out.println(que.remove());
//        System.out.println(que.offer(8));

        System.out.println(que.poll());
        System.out.println(que);
    }
}
