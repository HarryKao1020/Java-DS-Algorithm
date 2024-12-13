package JavaBasicDS.StackAndQueue;

// 就是對比標準的queue(FIFO)多了一些操作而已


import java.util.Deque;
import java.util.LinkedList;

public class MyDeque<E> {
    private LinkedList<E> list = new LinkedList<>();

    // 從頭插入元素,時間複雜度 O(1)
    void addFirst(E e){
        list.addFirst(e);
    }

    // 從尾巴插入元素,時間複雜度 O(1)
    void addLast(E e){
        list.addLast(e);
    }

    // 從頭刪除元素,時間複雜度 O(1)
    E removeFirst(){
        return list.removeFirst();
    }

    // 從尾刪除元素,時間複雜度 O(1)
    E  removeLast(){
        return list.removeLast();
    }

    // 查看頭元素，时间复杂度 O(1)
    E peekFirst() {
        return list.getFirst();
    }

    // 查看尾元素，时间复杂度 O(1)
    E peekLast() {
        return list.getLast();
    }

    public static void main(String[] args) {
        MyDeque<Integer> deque = new MyDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque.removeFirst());

        // java util內建的Deque
        Deque deque1 = new LinkedList<>();
        deque1.offerFirst(10);
        deque1.offerFirst(20);
        deque1.offerLast(30);
        deque1.offerLast(40);
        System.out.println(deque1.size());
        System.out.println(deque1.getFirst());


    }
}
