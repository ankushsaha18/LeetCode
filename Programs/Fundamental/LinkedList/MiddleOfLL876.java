package Fundamental.LinkedList;

public class MiddleOfLL876 {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        length = length/2;
        temp = head;
        while (length != 0){
            temp = temp.next;
            length--;
        }
        return temp;
    }
}
