package Fundamental.Sorting;

public class SortLL {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;
        left = sortList(left);
        right = sortList(right);

        return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode end = head;
        while((list1 != null) && (list2 != null)){
            if(list1.val < list2.val){
                end.next = list1;
                end = list1;
                list1 = list1.next;
            }else{
                end.next = list2;
                end = list2;
                list2 = list2.next;
            }
        }
        end.next = (list1 != null)? list1 : list2;
        return head.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head.next; // one place ahead as we want the first mid in case of even length LL
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
