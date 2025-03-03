package DesignPattern.Singleton.BeverageFactor_Example;

public class BeverageDemo {
    public static void main(String[] args) {
        // 程序啟動不會創建BeverageFactory Instance
        System.out.println("主程式啟動");
        // 已經創建了實例，可以直接使用
        System.out.println(BeverageFactoryTest.INSTANCE.produceCola());

        // 第一次取得Factory Instance才會創建Instance
        System.out.println("第一次獲得BeverageFactory Instance");

        BeverageFactory factory1 = BeverageFactory.getInstance();

        // 生產飲料
        System.out.println(factory1.produceCola());
        System.out.println(factory1.produceAppleJuice());

        // 創建第二個BeverageFactor Instance , 不會重新新建立一個instance,只有單一個instance
        BeverageFactory factory2 = BeverageFactory.getInstance();
        // 生產飲料
        System.out.println(factory2.produceCola());
        System.out.println(factory2.produceAppleJuice());

        //驗證是同一個instance
        System.out.println("兩個工廠是同一個實例：" + (factory1==factory2));

    }
}
