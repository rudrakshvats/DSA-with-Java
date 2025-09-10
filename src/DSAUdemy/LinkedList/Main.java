package DSAUdemy.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        printDetails(linkedList);

        linkedList.append(1);

        // for append
        System.out.println("After append: ");
        printDetails(linkedList);

        linkedList.removeLast();

        // for removeLast
        System.out.println("After removeLast: ");
        printDetails(linkedList);

        linkedList.prepend(2);

        // for prepend
        System.out.println("After prepend: ");
        printDetails(linkedList);

        linkedList.removeFirst();

        // for removeFirst
        System.out.println("After removeFirst");
        printDetails(linkedList);
    }

    private static void printDetails(LinkedList linkedList) {
        linkedList.printLinkedList();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        System.out.println();
    }
}
