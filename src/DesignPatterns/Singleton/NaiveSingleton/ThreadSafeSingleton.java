package DesignPatterns.Singleton.NaiveSingleton;

public class ThreadSafeSingleton {
    // the instance will not only be private and static but also volatile so that double check lock would work correctly
    private static volatile ThreadSafeSingleton instance;
    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        // here we will take approach of double check locking (DCL), it exists to prevent race conditions between
        // multiple threads that may attempt to get singleton instance at the same time, creating separate instance
        // as a result
        ThreadSafeSingleton result = instance;
        if (null != result) return result;
        synchronized (ThreadSafeSingleton.class) {
            result = instance;
            if (null == result) instance = result = new ThreadSafeSingleton(value);
            return result;
        }
    }
}
