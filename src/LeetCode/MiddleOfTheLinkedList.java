package LeetCode;

public class MiddleOfTheLinkedList {

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

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fastNode = head;
            ListNode slowNode = head;

            // the logic of moving the fastNode two times is the logic of thinking that the length of LinkedList divide by 2
            // should be the point where slowNode should be at the full traversal, if we move fastNode two times then at the
            // end of the LinkedList the slowNode will always be at the second middle position
            while (fastNode != null && fastNode.next != null) {
                slowNode = slowNode.next;
                fastNode = fastNode.next.next;
            }

            return slowNode;
        }
    }
}
