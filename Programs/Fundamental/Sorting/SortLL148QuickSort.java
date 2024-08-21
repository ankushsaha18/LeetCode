package Fundamental.Sorting;


// This one is not used as it fails for large test cases

import Fundamental.LinkedList.ListNode;

public class SortLL148QuickSort {
    public Fundamental.LinkedList.ListNode sortList(Fundamental.LinkedList.ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        quickSort(head,getTail(head));
        return head;
    }
    public Fundamental.LinkedList.ListNode getTail(Fundamental.LinkedList.ListNode head){
        Fundamental.LinkedList.ListNode tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        return tail;
    }
    public void swap(Fundamental.LinkedList.ListNode a, Fundamental.LinkedList.ListNode b){
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
    public void quickSort(Fundamental.LinkedList.ListNode head, Fundamental.LinkedList.ListNode tail){
        if(head == null || head.next == null || head == tail){
            return;
        }
        Fundamental.LinkedList.ListNode partition = getPartition(head,tail);
        quickSort(head,partition);
        quickSort(partition.next,tail);
    }
    public Fundamental.LinkedList.ListNode getPartition(Fundamental.LinkedList.ListNode head, Fundamental.LinkedList.ListNode tail){
        Fundamental.LinkedList.ListNode pivot = head;
        Fundamental.LinkedList.ListNode current = head.next;
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
