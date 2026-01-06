package DesignPatterns.Singleton;

public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance(); // creating a instance variable and initialising it with getEagerInstance method
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2);

        /*
         OUTPUT:
            DesignPatterns.Singleton.SingletonEager@368102c8
            DesignPatterns.Singleton.SingletonEager@368102c8

            notice the above variables are referencing to the same instance and printing the same address
         */
    }
}
