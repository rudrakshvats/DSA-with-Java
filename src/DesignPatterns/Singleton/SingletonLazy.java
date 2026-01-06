package DesignPatterns.Singleton;

public class SingletonLazy {

    private static SingletonLazy lazyInstance;

    private SingletonLazy() {
    }

    public static SingletonLazy getLazyInstance() {
        if (null == lazyInstance) {
            lazyInstance = new SingletonLazy();
        }

        return lazyInstance;
    }
}
