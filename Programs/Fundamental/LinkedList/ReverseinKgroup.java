package Fundamental.LinkedList;

import javax.lang.model.util.Elements;

public class ReverseinKgroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        int length = getLength(head);
        if(head == null || k < 2){
            return head;
        }
        int left = 1;
        int right = k;
        while (right <= length){
            head = reverseBetween(head,left,right);
            left = left + k;
            right = right + k;
        }
        return head;
    }
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
    public int getLength(ListNode head){
        int ans = 0;
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            ans++;
        }
        return ans;
    }
}
