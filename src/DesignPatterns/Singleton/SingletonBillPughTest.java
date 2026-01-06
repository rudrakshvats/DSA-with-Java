package DesignPatterns.Singleton;

public class SingletonBillPughTest {
    public static void main(String[] args) {
        SingletonBillPugh billPughInstance1 = SingletonBillPugh.getBillPughInstance();
        SingletonBillPugh billPughInstance2 = SingletonBillPugh.getBillPughInstance();

        System.out.println(billPughInstance1);
        System.out.println(billPughInstance2);
    }
}
