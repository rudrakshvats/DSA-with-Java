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
            // simply swap head and tail using a third Node temp
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

    /*
    This algorithm is also solved by two pointer method of slow and fast node, but in some problems like below we don't have to move fast by 2 nodes,
    in this problem we first move fast single time only, so we have to think for solution based on how to use pointers from starting point till end of
    LinkedList
     */
    public Node findKthFromEnd(int k) {
        if (k <= 0) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        int i = 0;
        while (i < k) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            i += 1;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }


        return slow;
    }

    /*
    Remove Duplicates from LinkedList
     */

    public void removeDuplicates() {
        Node current = head; // take current node which will be assigned to the head node
        while (current != null) { // we will check if the current node is not null and run loop until it reaches the tail of the linked list
            Node runner = current; // next we will take runner node which will also be assigned to the current node
            while (runner.next != null) { // we will run a loop to traverse runner node from current node to tail node
                if (runner.next.value == current.value) { // check if the runner node's next value is equal to the current node's value
                    runner.next = runner.next.next; // we will assign the runner node's next node to the next to next node value so that we can remove the next node
                    length -= 1; // simply decrement the length of the LinkedList by 1
                } else {
                    runner = runner.next; // otherwise move to the next node
                }
            }
            current = current.next; // after loop is completed, assign current node to its next node
        }
    }


    /*
    Binary to Decimal
     */
    public int binaryToDecimal() {
        if (head == null) {
            return 0;
        }
        if (head.next == null) {
            if (head.value == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        Node current = head;
        int num = 0;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }

        return num;
    }

    /*
    Partition List
     */
    public void partitionList(int x) { // LinkedList{[3],[8],[1],[4],[6]}
        if (null == head) {
            return;
        }
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;
        while (null != current) {
            if (x > current.value) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }

    /*
    Reverse Between
     */
    public void reverseBetween(int m, int n) { // 1(head 0) -> 2(m 1) -> 3 (2) -> 4(n 3) -> 5 (4)
        if (null == head) {
            return;
        }
        if (null == head.next) {
            return;
        }
        Node current = head;
        Node prev1 = head;
        Node prev2 = head;
        Node firstNode = new Node (0);
        Node secondNode = new Node(0);
        while (null != current) {
            prev1 = current;
            if (current.next.value == m) {
                firstNode = current.next;
                break;
            }
            current = current.next;
        }
        current = head;
        while (null != current) {
            prev2 = current;
            if (current.next.value == n) {
                secondNode = current.next;
                break;
            }
            current = current.next;
        }

        Node temp = firstNode.next;
        firstNode.next = secondNode.next;
        secondNode.next = temp;

        prev1.next = secondNode;
        prev2.next = firstNode;
    }
}
