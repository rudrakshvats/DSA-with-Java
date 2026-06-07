package LeetCode;

public class LinkedListCycle {

//    public boolean hasCycle(ListNode head) {
//        if (head == null) return false;
//        Set<ListNode> set = new HashSet<>();
//        set.add(head);
//        head = head.next;
//
//        while (head != null) {
//            if (set.contains(head)) return true;
//            set.add(head);
//
//            head = head.next;
//        }
//
//        return false;
//    }

    // TC = O(n)
    // SC = O(n)

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow.equals(fast)) return true;
        }

        return false;
    }

    // TC = O(n)
    // SC = O(1)

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
