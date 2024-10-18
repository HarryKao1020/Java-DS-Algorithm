package JavaBasicDS.StackAndQueue;

import java.util.Deque;
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

        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.push(1);


        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(10);
        deque.addFirst(2);
        deque.addLast(4);

        System.out.println(deque.offerFirst(3));

    }
}
