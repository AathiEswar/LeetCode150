package LeetCode150.LinkedList;


public class MergeTwoSortedLinkedList {

    public static Node mergeTwoSortedLinkedList(Node list1,Node list2){
        Node dummy = new Node(0);
        Node temp = dummy;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 == null){
            temp.next = list2;
        }
        if(list2 == null){
            temp.next = list1;
        }
        return dummy.next;
    }
}
