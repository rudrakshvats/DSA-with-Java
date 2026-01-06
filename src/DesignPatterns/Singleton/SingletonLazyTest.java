package DesignPatterns.Singleton;

public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy lazyInstance1 = SingletonLazy.getLazyInstance();
        SingletonLazy lazyInstance2 = SingletonLazy.getLazyInstance();

        System.out.println(lazyInstance1);
        System.out.println(lazyInstance2);
    }
}
