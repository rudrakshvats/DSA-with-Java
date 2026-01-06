package DesignPatterns.Singleton;

public class SingletonStaticBlock {

    private static SingletonStaticBlock staticBlockInstance; // creating a static variable but not initialising it

    static {
        staticBlockInstance = new SingletonStaticBlock(); // initialising it in a static block instead
    }

    private SingletonStaticBlock() {

    }

    public static SingletonStaticBlock getStaticInstance() {
        return staticBlockInstance;
    }
}
