package solved.linkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    static class ListNode {
        int val;

        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solver {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }

            return dummy.next;
        }
    }
}
