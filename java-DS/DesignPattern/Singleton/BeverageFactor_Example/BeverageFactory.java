package DesignPattern.Singleton.BeverageFactor_Example;

public class BeverageFactory {

    private BeverageFactory(){
        System.out.println("BeverageFactory Instance 已被創建了!");
    }

    private static class BeverageFactoryHolder{
        static {
            System.out.println("BeverageFactoryHolder 內部類被加載了");
        }
        private static final BeverageFactory INSTANCE = new BeverageFactory();
    }

    public static BeverageFactory getInstance(){
        return BeverageFactoryHolder.INSTANCE;
    }

    public String produceCola(){
        return "一瓶可樂已生產完成";
    }

    public String produceAppleJuice(){
        return "一瓶蘋果汁已生產完成";
    }
}
