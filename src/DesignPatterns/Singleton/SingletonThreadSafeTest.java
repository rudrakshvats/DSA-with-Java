package DesignPatterns.Singleton;

public class SingletonThreadSafeTest {

    public static void main(String[] args) {
        SingletonThreadSafe threadSafeInstance1 = SingletonThreadSafe.getThreadSafeInstance();
        SingletonThreadSafe threadSafeInstance2 = SingletonThreadSafe.getThreadSafeInstance();

        System.out.println(threadSafeInstance1);
        System.out.println(threadSafeInstance2);
    }
}
