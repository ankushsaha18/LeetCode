package Fundamental.LinkedList;

public class LLCycleII142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                while(slow != entry){
                    entry = entry.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
