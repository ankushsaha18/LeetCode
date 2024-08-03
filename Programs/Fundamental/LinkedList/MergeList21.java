package Fundamental.LinkedList;

public class MergeList21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode head = new ListNode();
       ListNode end = head;
       while ((list1 != null) && (list2 != null)) {
           if(list1.val < list2.val){
               end.next = list1;
               end = list1;
               list1 = list1.next;
           } else {
               end.next = list2;
               end = list2;
               list2 = list2.next;
           }
       }
       end.next = (list1 != null) ? list1 : list2;
       return head.next;
    }
}
