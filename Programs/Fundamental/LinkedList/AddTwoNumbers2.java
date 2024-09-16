package Fundamental.LinkedList;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while (l1 != null && l2 != null){
            int current = l1.val + l2.val + carry;
            carry = current/10;
            current %= 10;
            temp.next = new ListNode(current);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int current = l1.val + carry;
            carry = current/10;
            current %= 10;
            temp.next = new ListNode(current);
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null){
            int current = l2.val + carry;
            carry = current/10;
            current %= 10;
            temp.next = new ListNode(current);
            temp = temp.next;
            l2 = l2.next;
        }
        if(carry > 0) {
            temp.next = new ListNode(carry);
        }
        return ans.next;
    }
}
