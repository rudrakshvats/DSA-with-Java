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

    public boolean set(int index, int value) {
        Node temp = get(index); // we will get Node where value needs to be set
        // if temp is in range then simply set the value or else return false
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) { // if index is less than head index then simply prepend
            prepend(value);
            return true;
        }
        if (index == length) { // if index is more than tail index then simply append
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1); // since newNode will be inserted at some point, we would require Node at index - 1 because it will point to the newNode to be inserted
        newNode.next = temp.next; // the newNode which is going to be inserted will now also point to the temp node
        temp.next = newNode; // temp node will now point to the newNode, so it will be inserted
        length += 1;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) { // if index is equal to 0 then simply use removeFirst() because that method simply does removal at index 0 and returns a Node
            /*
            removeFirstLogicRevise
            if (length == 0) {
                return null;
            }
            Node temp = head;
            head = head.next;
            temp.next = null;
            length -= 1;
            if (length == 0) {
                return null
            }
            return temp;
            */
            return removeFirst();
        }
        if (index == length - 1) { // if index is equal to length - 1 then simply use removeLast() because that method simply removes at index length - 1 and returns a Node
            /*
            removeLastLogicRevise
            if (length == 0) {
                return null;
            }
            Node previous = head;
            Node temp = head;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            tail = previous;
            temp.next = null;
            length -= 1;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
            */
            return removeLast();
        }
        Node previous = get(index - 1); // we will need one Node which is present at index - 1
        Node temp = previous.next; // then we can get the Node which is going to be removed by next method on previous Node in last step
        previous.next = temp.next; // simply point temp.next to previous.next because previous should now point to the Node which is after temp
        temp.next = null; // then point next of temp to null because now temp needs to be removed
        length -= 1;
        return temp;
    }

    public void reverse() {
        if (length > 0) {
            // simply swap head and tail using a third Nod temp
            Node temp = head;
            head = tail;
            tail = temp;
            // create two extra nodes for iteration and reversing
            Node after;
            Node before = null; // this node act Node which is null i.e. after tail Node
            for (int i = 0; i < length; i++) {
                // after will be the node which is just after temp
                after = temp.next;
                // temp now needs to point reverse because LinkedList needs to be reversed
                temp.next = before;
                // then before needs to be iterated further in order for traversal
                before = temp;
                // for traversing temp further we will make it equal to after Node
                temp = after;
            }
        }
    }

    // the following method will now cover Leet Code exercises

    /*
    Given the head of a singly linked list, return the middle node of the linked list.

    If there are two middle nodes, return the second middle node.

    Example 1:

    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.

    Example 2:

    Input: head = [1,2,3,4,5,6]
    Output: [4,5,6]
    Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

    Constraints:

    The number of nodes in the list is in the range [1, 100].
    1 <= Node.val <= 100
     */

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop() {
        if (length == 0) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while ((fast != null && fast.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
