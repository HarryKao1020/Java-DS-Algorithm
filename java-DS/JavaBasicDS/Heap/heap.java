package JavaBasicDS.Heap;

import java.awt.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class heap {



    public static void main(String[] args) {

        /* 初始化堆積 */
        // 初始化小頂堆積 ,排序是從小到大,剛好跟PriorityQueue一樣
        Queue<Integer> minHeap = new PriorityQueue<>();

        // 初始化大頂堆積（使用 lambda 表示式修改 Comparator 即可）
        // b-a 如果是正數，代表b>a ,較大的數字會先排在前面
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);

        maxHeap.offer(3);
        maxHeap.offer(1);
        maxHeap.offer(7);
        maxHeap.offer(2);

        System.out.println("maxHeap:"+maxHeap);
        int peak = maxHeap.peek(); // 取出heap頂 (7,3,2,1)
        System.out.println("maxHeap peak: "+ maxHeap.peek());
        int size = maxHeap.size();
        for(int i = 0 ; i< size;i++){
            System.out.print(maxHeap.poll()+" ");
        }

        //判斷heap是否為空
        boolean isEmpty = maxHeap.isEmpty();

        // 輸入Array並建立heap
        minHeap = new PriorityQueue<>(Arrays.asList(1,3,2,5,4));
        System.out.println(minHeap);
    }
}


