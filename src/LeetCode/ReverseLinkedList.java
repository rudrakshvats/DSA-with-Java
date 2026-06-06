package LeetCode;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }

    public ListNode reverseList(ListNode head) {
        // we will solve this problem using iterative solution of using previous, current and next node
        // notice we are assigning null value to previous, why? because the reverse LinkedList tail node must point to
        // null
        ListNode previous = null;
        ListNode current = head;
        ListNode next;

        // for this problem we have to iterate through whole LinkedList
        while (current != null) {
            // first we will assign next to something, which will be current.next
            next = current.next;
            // next for reversing current must point to previous
            current.next = previous;
            // then we will update previous to have current
            previous = current;
            // and finally for traversing forward we will assign current to next
            current = next;
        }

        // here we are retuning previous as the output because it is now the new head of the reverse LinkedList, and the
        // current being null would give null response, and we cannot return head as well as it still is equal to head of
        // original LinkedList
        return previous;
    }
}
