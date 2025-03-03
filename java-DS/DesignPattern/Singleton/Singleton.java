package DesignPattern.Singleton;

public class Singleton {
    // 私有的建構子
    private Singleton(){}

    // 靜態
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
