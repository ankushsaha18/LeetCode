package Fundamental.LinkedList;

public class palindromeLL234 {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMiddle(head);
        ListNode tempHead = reverseEnd(mid.next);
        mid.next = null;
        ListNode p1 = head;
        ListNode p2 = tempHead;
        while (p2 != null) {
            if (p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public ListNode reverseEnd(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public ListNode getMiddle(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
