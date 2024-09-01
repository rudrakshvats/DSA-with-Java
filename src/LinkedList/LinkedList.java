package LinkedList;

public class LinkedList {
    private Node head;

    /*
    This method will insert a new Node into our LinkedList provided we know what is the head of the LinkedList
     */
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null; // why null ? because the data will be inserted at the end of the LinkedList and the end of the LinkedList can be identified by the Node who next node is null

        /*
        now we will check the insertion whether we are inserting element in an empty LinkedList or not
        */
        if (head == null) {
            head = node;
        }
        else {
            Node newNode = head; // otherwise we will create a new node and mark it as head
            while (newNode.next != null) {
                newNode = newNode.next;
            }
            newNode.next = node;
        }
    }

    /*
    This method will print the elements in our LinkedList
     */
    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data); // for printing the final node data
    }
}
