package Fundamental.LinkedList;

public class ReverseLLII92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for(int i = 0 ; current != null && i < left - 1 ; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode end = current;
        for(int i = 0 ; current != null && i < right - left + 1 ; i++){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        end.next = current;
        return head;
    }
}
