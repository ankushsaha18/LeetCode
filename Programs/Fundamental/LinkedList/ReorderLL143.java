package Fundamental.LinkedList;

public class ReorderLL143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = getMiddle(head);
        ListNode rev = reverse(mid.next);
        mid.next = null;
        ListNode current = head;
        while (current != null && rev != null){
            ListNode temp = current.next;
            current.next = rev;
            current = temp;

            temp = rev.next;
            rev.next = current;
            rev = temp;
        }
    }
    public ListNode reverse(ListNode head){
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
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
