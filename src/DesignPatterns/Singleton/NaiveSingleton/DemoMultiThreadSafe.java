package DesignPatterns.Singleton.NaiveSingleton;

public class DemoMultiThreadSafe {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        // for multithreads we will create 2 new threads and pass on new constructors for our two different thread classes defined below
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        // then simply start the both threads
        threadFoo.start();
        threadBar.start();
    }

    // a class becomes thread when it implements Runnable interface, which means we have to implement the run() method and override it with our logic
    static class ThreadFoo implements Runnable{
        // inside the run method we will create an instance for first thread
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
