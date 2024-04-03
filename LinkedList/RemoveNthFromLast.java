package LeetCode150.LinkedList;

public class RemoveNthFromLast {
    //Two Pass
    public static ListNode nthFromLast(ListNode head , int n){

        int size = 1;

        ListNode temp = head;

        while(temp.next != null){
            size+=1;
            temp = temp.next;
        }

        temp = head;

        for(int i=1 ; i< size-n ; i++){
            temp = temp.next;
        }

        if(size == n)head = head.next;
        else temp.next = temp.next.next;

        return head;
    }

    //ONe pass

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = head;

        while(n > 0 && right != null){
            right = right.next;
            n-=1;
        }

        while(right != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return dummy.next;

    }
}
