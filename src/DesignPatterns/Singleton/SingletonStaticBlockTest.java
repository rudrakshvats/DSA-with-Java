package DesignPatterns.Singleton;

public class SingletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock staticInstance1 = SingletonStaticBlock.getStaticInstance();
        SingletonStaticBlock staticInstance2 = SingletonStaticBlock.getStaticInstance();

        System.out.println(staticInstance1);
        System.out.println(staticInstance2);

        /*
        OUTPUT:

        DesignPatterns.Singleton.SingletonStaticBlock@368102c8
        DesignPatterns.Singleton.SingletonStaticBlock@368102c8

        similarly to eager instance the same reference is assigned to both the variables
         */
    }
}
