package JavaBasicDS;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30); // add 如果queue滿了 會噴 IllegalStateException
        queue.offer(40); // offer 如果queue滿了會拋出false
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
