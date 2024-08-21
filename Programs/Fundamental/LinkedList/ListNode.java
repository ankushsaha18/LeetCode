package Fundamental.LinkedList;

public  class ListNode{
    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int x,ListNode next) {
        val = x ;
        this.next = next;
    }
    ListNode(int x) { val = x; }
}
