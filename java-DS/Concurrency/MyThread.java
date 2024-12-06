package Concurrency;

// 此方法不太好,因為會直接改寫Java的thread , 可以改用implements Runnable
public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("My name is Monster Kao");
    }
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
