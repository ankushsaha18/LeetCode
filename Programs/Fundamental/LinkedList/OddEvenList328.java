package Fundamental.LinkedList;

public class OddEvenList328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenStart = even;
        while (odd.next != null && even.next != null){
            odd.next = even.next; // assign next odd
            odd = odd.next;
            even.next = odd.next; // assign next even
            even = even.next;
        }
        odd.next = evenStart;
        return head;
    }
}
