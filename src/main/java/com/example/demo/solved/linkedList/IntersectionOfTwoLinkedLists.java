package com.example.demo.solved.linkedList;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cloneA = headA;
        ListNode cloneB = headB;

        while (cloneA != cloneB) {
            if (cloneA == null) {
                cloneA = headB;
            } else {
                cloneA = cloneA.next;
            }

            if (cloneB == null) {
                cloneB = headA;
            } else {
                cloneB = cloneB.next;
            }
        }

        return cloneA;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
