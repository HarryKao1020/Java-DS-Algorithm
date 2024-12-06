package Concurrency;


public class ConcurrencyProblem {
    public static int cnt = 0;

    public static void main(String[] args) throws InterruptedException{
        Thread t1  = new Thread(()->{
            for(int i =0; i<10000;i++){
                cnt+=1;
            }
        });

        Thread t2 = new Thread(()->{
            for(int i =0 ; i <10000;i++){
                cnt +=1;
            }
        });

        t1.start();
        t2.start();
        Thread.sleep(2000);
        // 一般來說預期結果會是20000,但因爲thread會自動切換來切換去,造成資料不一致
        System.out.println(cnt);
    }
}
