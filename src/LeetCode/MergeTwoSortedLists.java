package LeetCode;

public class MergeTwoSortedLists {

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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // create a dummy variable of ListNode type, this will be head of the list
            ListNode dummy = new ListNode(-1);
            // create a temp variable and assign it to the head of the LinkedList
            ListNode temp = dummy;

            // run a loop until one of the ListNode is null
            while (null != list1 && null != list2) {
                // check if list1's val is less than equal to list2's val, if yes then assign next node of temp to
                // list1 node and move list1 to next value of list1
                if (list1.val <= list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                }
                // else do the same for list2
                else {
                    temp.next = list2;
                    list2 = list2.next;
                }

                // assign temp to the next node value of temp
                temp = temp.next;
            }

            // this if else condition will be the one for remaining node as after while loop one element of either
            // list1 or list2 node will not be null, if list1 is not null then assign temp's next node to list1 node
            if (list1 != null) temp.next = list1;
            // else assign temp's next node to list2 node
            else temp.next = list2;

            // since temp's next node is null, and we require the head of LinkedList to be returned so we will use
            // dummy variable and return its next node
            return dummy.next;
        }
    }
}
