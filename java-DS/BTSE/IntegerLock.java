package BTSE;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerLock {

    // 解法1 : 用AtomicInteger 保持count有原子性操作
    private static AtomicInteger count = new AtomicInteger(0);

    // 解法2 : 用synchronized 跟 Object lock
//    private static Integer count = 0;
//    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> increment());
        Thread t2 = new Thread(() -> increment());


        t1.start(); // thread1 啟動
        t2.start(); // thread2 啟動 跟thread1並行運作
        t1.join(); // 確保thread1執行完成 , 用join() 需要 throws InterruptedException
        t2.join(); // 確保thread2執行完成, 用join() 需要 throws InterruptedException

        System.out.println("Final Count: " + count);
    }

    public static void increment() {
        for (int i = 0; i < 1000; i++) {
            // 解法1 : 用AtomicInteger 保持count有原子性操作
            count.incrementAndGet();

            // 解法2 : synchronized針對lock
//            synchronized (lock){
//                count++;
//            }

        }
    }
}
