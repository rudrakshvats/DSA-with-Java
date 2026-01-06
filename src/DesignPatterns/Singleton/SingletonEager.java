package DesignPatterns.Singleton;

public class SingletonEager {

    private static SingletonEager eagerInstance = new SingletonEager(); // creating a static variable which will be package private and can be accessed anywhere in the class

    private SingletonEager() { // writing a default constructor

    }

    public static SingletonEager getEagerInstance() { // creating a get method which returns static instance initialised above
        return eagerInstance;
    }
}
