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
        System.out.println("After removeFirst: ");
        printDetails(linkedList);

        System.out.println("Appending elements");
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        System.out.println("After append: ");
        printDetails(linkedList);

        LinkedList.Node node = linkedList.get(2);

        // for get
        System.out.println("Value at index: " + 2 + " is: " + node.value);
        System.out.println();

        linkedList.set(2, 8);

        // for set
        System.out.println("After set: ");
        printDetails(linkedList);

        System.out.println("Inserting an element at index 2");
        linkedList.insert(2, 7);
        printDetails(linkedList);

        System.out.println("Removing an element at index 2");
        System.out.println("After remove: ");
        linkedList.remove(2);
        printDetails(linkedList);

        System.out.println("Reversing Linked List");
        linkedList.reverse();
        System.out.println("After reverse: ");
        printDetails(linkedList);

        linkedList.printLinkedList();
        System.out.println("Middle node of LinkedList: " + linkedList.findMiddleNode().value);
        linkedList.append(6);
        linkedList.printLinkedList();
        System.out.println("After append, Middle node of LinkedList: " + linkedList.findMiddleNode().value);

        linkedList.printLinkedList();
        System.out.println("Does LinkedList has loop?: " + (linkedList.hasLoop() ? "Yes" : "No"));

        linkedList.printLinkedList();
        System.out.println("2nd last node from end is: " + linkedList.findKthFromEnd(2).value);
    }

    private static void printDetails(LinkedList linkedList) {
        linkedList.printLinkedList();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        System.out.println();
    }
}
