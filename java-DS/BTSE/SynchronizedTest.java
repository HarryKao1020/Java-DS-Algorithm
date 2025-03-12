package BTSE;

class MyResource{
    public synchronized void doSome() {
        System.out.println("doSome begin");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("doSome over");
    }

    public void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }

}

class ThreadTask implements Runnable{
    private MyResource mr;
    public ThreadTask(MyResource mr){
        this.mr = mr;
    }
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("t1")){
            mr.doSome();
        } else if (Thread.currentThread().getName().equals("t2")) {
            mr.doOther();
        }

    }
}

public class SynchronizedTest {
    public static void main(String[] args) throws InterruptedException {
        MyResource myResource = new MyResource();
        Thread thread1 = new Thread(new ThreadTask(myResource),"t1");
        Thread thread2 = new Thread(new ThreadTask(myResource),"t2");
        thread1.start();
//        Thread.sleep(1000);
        thread2.start();
    }
}
