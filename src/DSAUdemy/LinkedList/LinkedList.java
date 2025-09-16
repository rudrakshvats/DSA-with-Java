package DSAUdemy.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    public int length;

    static class Node {
        public int value;
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
        System.out.print("LinkedList{");
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.value + ((temp.next == null) ? "]": "],"));
            temp = temp.next;
        }
        System.out.println("}");
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

    public void append(int value) {
        Node newNode = new Node(value);

        // check if the LinkedList is empty or not, if the LinkedList is empty then head and tail will simply be the newNode which is going to be appended
        if (length == 0) {
            head = newNode;
        }
        // if the LinkedList is not empty then the tail of the LinkedList will now point to the newNode and then newNode will become the newNode
        else {
            tail.next = newNode;
        }
        tail = newNode;

        // since newNode is appended in both cases, length will always increase by 1
        length += 1;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        // now we are going to use two variables temp and pre which will be used to remove tail and assign new tail which is one Node before tail, since we are starting from first we will assign both variables to head node
        Node temp = head;
        Node pre = head;
        // loop through the LinkedList till temp.next doesn't point to null
        while (temp.next != null) {
            // assign the pre Node to temp
            pre = temp;
            // assign the temp Node to next Node so that iteration continues
            temp = temp.next;
        }
        // when we reach the end of the LinkedList i.e. when temp points to null
        tail = pre;
        tail.next = null;
        length -= 1;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value) {
        // for prepending any Node to the LinkedList, first we will create a Node
        Node node = new Node(value);
        // check if LinkedList is empty or not, if yes then simply assign head and tail to the node value
        if (length == 0) {
            head = node;
            tail = node;
        }
        // if the LinkedList is not empty, then we simply point node to head first, and then mark the node as head because now its taking position of head
        else {
            node.next = head;
            head = node;
        }
        // since prepend operation increase the length of LinkedList by 1, then simply increment length value by 1
        length += 1;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        // take a variable node which will be assigned to the head of the node
        Node temp = head;
        // the head will now be the second node which actually comes after head
        head = head.next;
        // since temp node needs to be remove, we will assign it the next value to be null
        temp.next = null;
        // decrement length by 1
        length -= 1;
        // if the linkedList was already of size 1 and now it became 0, we will assign tail value null
        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {
        // if any negative index or index greater than or equal to length of LinkedList then simply return null because there will be no Node at those index values
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head; // since we are starting from head then we will assign temp value of head
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }
}
