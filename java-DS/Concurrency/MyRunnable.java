package Concurrency;

public class MyRunnable implements Runnable {

    @Override
    public void run(){
        System.out.println("Hi My name is Monster Kao");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        Thread t2 = new Thread(() ->{
            System.out.println("Hi I am lambda runnable");
        });
        t2.start();


    }
}
