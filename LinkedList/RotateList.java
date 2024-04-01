package LeetCode150.LinkedList;

public class RotateList {
    public static ListNode rotateList(ListNode head , int k){
        if(head == null || head.next == null || k == 0){
            return head;

        }
        int size = 1;
        ListNode tail = head;
        while(tail.next != null){
            size++;
            tail = tail.next;
        }

        tail.next = head;
        int count = k% size;

        for(int i=0;i< size-count ; i++){
            tail = tail.next;
        }

        head = tail.next;

        tail.next = null;
        return head;
    }
}
