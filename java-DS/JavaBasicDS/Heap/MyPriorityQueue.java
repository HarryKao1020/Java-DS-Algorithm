package JavaBasicDS.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {

        // minHeap , PriorityQueue 預設是 minHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(13);
        minHeap.offer(8);
        minHeap.offer(2);
        minHeap.offer(9);
        minHeap.offer(4);
        // 取peek=取最小值
        System.out.println("minHeap peek:" + minHeap.peek());

        while(!minHeap.isEmpty()){
            // 取出頂
            System.out.println(minHeap.poll());
        }
        System.out.println();

        // maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(3);
        maxHeap.offer(8);
        maxHeap.offer(1);
        maxHeap.offer(13);
        maxHeap.offer(2);
        // 取peak = 取最大值
        System.out.println("maxHeap peek:"+ maxHeap.peek());
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }



    }
}
