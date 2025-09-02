package DSAUdemy.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    public int length;

    class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
