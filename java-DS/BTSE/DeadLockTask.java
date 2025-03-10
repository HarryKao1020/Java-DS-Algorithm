package BTSE;

// 資源的物件
class Resource {
    private final String name;

    // Dead Lock 解法1 ,在資源上加上id,用id的大小去規定thread都只能先拿id較小的或較大的,有順序
    private final int id;


    public Resource(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}

// Thread 執行的Task
class Task implements Runnable{

    private final Resource resource1;
    private final Resource resource2;


    public Task(Resource resource1, Resource resource2){
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        Resource firstResource = resource1.getId() < resource2.getId() ? resource1 : resource2;
        Resource secondResource = resource1.getId() < resource2.getId() ? resource2 : resource1;
        synchronized (firstResource){
            System.out.println(Thread.currentThread().getName() + " locked " + firstResource.getName());

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {

            }
            synchronized (secondResource){
                System.out.println(Thread.currentThread().getName() + " locked "+ secondResource.getName());
            }
        }

    }
}
public class DeadLockTask {
    public static void main(String[] args) {


        // 會Dead Lock , thread1 先拿到resA , thread2 拿到resB , 然後到synchronized(resource2) 時 ,ThreadA佔領resource1 ,所以Thread2拿不到resource2
        Resource resA = new Resource("Resource A",1);
        Resource resB = new Resource("Resource B",2);
        Thread thread1 = new Thread(new Task(resA,resB));
        Thread thread2 = new Thread(new Task(resB,resA));
        thread1.start();
        thread2.start();

    }

}
