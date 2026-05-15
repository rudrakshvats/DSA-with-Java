package DesignPatterns.Singleton.NaiveSingleton;

// for single thread
public class NaiveSingleton {

    private static NaiveSingleton instance;
    public String value;

    private NaiveSingleton(String value) {
        // for emulating slow initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    }

    public static NaiveSingleton getInstance(String value) {
        if (null == instance) instance = new NaiveSingleton(value);
        return instance;
    }
}
