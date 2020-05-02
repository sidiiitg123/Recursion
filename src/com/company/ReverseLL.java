package com.company;

public class ReverseLL {
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    ListNode head;
    public ListNode reverseList(ListNode A) {

        if(A.next==null){
            head=A;
            return head;
        }
        reverseList(A.next);
        A.next.next=A;
        A.next=null;

        return head;
    }

}
