package DesignPattern.Singleton.BeverageFactor_Example;

public class BeverageFactoryTest {

    public BeverageFactoryTest(){
        System.out.println("BeverageFactoryTest Instance 已被創立");
    }

    public static final BeverageFactoryTest INSTANCE = new BeverageFactoryTest();

    public String produceCola(){
        return "Cola";
    }



}
