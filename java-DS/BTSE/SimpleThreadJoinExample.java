package BTSE;

class MyTask implements Runnable{
    private static int count = 0;
    @Override
    public void run() {
        for(int i = 0 ; i < 100; i++){
            count++;
            System.out.println(Thread.currentThread().getName() + " is running: " + count);
            try {
                Thread.sleep(5); // 模擬執行緒運行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("count result:"+count);
    }
}

public class SimpleThreadJoinExample {

    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t1.join();
        t2.start();

        t2.join();
    }

}
