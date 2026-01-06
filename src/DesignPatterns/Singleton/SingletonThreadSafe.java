package DesignPatterns.Singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe threadSafeInstance;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getThreadSafeInstance() {
        synchronized (SingletonThreadSafe.class) {
            if (null == threadSafeInstance) {
                threadSafeInstance = new SingletonThreadSafe();
            }
        }

        return threadSafeInstance;
    }
}
