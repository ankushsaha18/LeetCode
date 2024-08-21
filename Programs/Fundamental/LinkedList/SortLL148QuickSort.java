package Fundamental.LinkedList;


// This one is not used as it fails for large test cases

public class SortLL148QuickSort {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        quickSort(head,getTail(head));
        return head;
    }
    public ListNode getTail(ListNode head){
        ListNode tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        return tail;
    }
    public void swap(ListNode a,ListNode b){
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
    public void quickSort(ListNode head,ListNode tail){
        if(head == null || head.next == null || head == tail){
            return;
        }
        ListNode partition = getPartition(head,tail);
        quickSort(head,partition);
        quickSort(partition.next,tail);
    }
    public ListNode getPartition(ListNode head,ListNode tail){
        ListNode pivot = head;
        ListNode current = head.next;
        ListNode prev = head;
        while(current != tail.next){
            if(pivot.val > current.val){
                swap(prev.next,current);
                prev = prev.next;
            }
            current = current.next;
        }
        swap(prev,pivot);
        return prev;
    }
}
