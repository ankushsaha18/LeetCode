package Fundamental.LinkedList;

public class RotateRightLL61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k<1){
            return head;
        }
        int length = length(head);
        k = k%length;
        head = reverse(head,1,length);
        head = reverse(head,1,k);
        head = reverse(head,k+1,length);
        return head;
    }
    public ListNode reverse(ListNode head,int left,int right){
        if(left >= right){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        for(int i = 0 ; current != null && i < left - 1 ; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode end = current;
        for(int i = 0 ; current != null && i < right - left + 1 ;i++){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        if(last != null) {
            last.next = prev;
        }else{
            head = prev;
        }
        end.next = current;
        return head;
    }
    public int length(ListNode head){
        int ans = 0;
        ListNode temp = head;
        while (temp != null){
            ans++;
            temp = temp.next;
        }
        return ans;
    }
}
