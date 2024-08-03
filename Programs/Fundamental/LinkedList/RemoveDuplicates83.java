package Fundamental.LinkedList;

public class RemoveDuplicates83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            int curr = temp.val;
            while ((temp.next != null) && (temp.next.val == curr)){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
