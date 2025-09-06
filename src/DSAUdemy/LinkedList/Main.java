package DSAUdemy.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printLinkedList();

        linkedList.append(1);

        // for append
        System.out.println("After Append");
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printLinkedList();

        linkedList.removeLast();

        // for removeLast
        System.out.println("After removeLast");
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printLinkedList();
    }
}
