package JavaBasicDS.Tree;


import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue2 {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 5;i<=5;i--){
            priorityQueue.offer(i);
        }
        Object[] myArray = priorityQueue.toArray();
        System.out.println("print out our array");
        for(Object num:myArray){
            System.out.println(num);
        }
    }
}
