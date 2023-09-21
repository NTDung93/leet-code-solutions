package solved.linkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        // Create a linked list
        PalindromeLinkedList.ListNode head = palindromeLinkedList.new ListNode(1);
        head.next = palindromeLinkedList.new ListNode(1);
        head.next.next = palindromeLinkedList.new ListNode(2);
        head.next.next.next = palindromeLinkedList.new ListNode(1);

        boolean isPalindrome = palindromeLinkedList.isPalindrome(head);

        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = reverse(slow.next);
        ListNode firstHalfHead = head;

        while (secondHalfHead != null && firstHalfHead != null){
            if (secondHalfHead.val != firstHalfHead.val) return false;

            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
