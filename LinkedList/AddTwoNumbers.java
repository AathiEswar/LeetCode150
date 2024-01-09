package LeetCode150.LinkedList;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddTwoNumbers {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry !=0){
            int val1 = l1==null ? 0 : l1.val;
            int val2 = l2==null ? 0 : l2.val;

            int sum = val1+val2 + carry;
            carry = sum / 10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum);
            cur.next = newNode;
            cur = cur.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next;
    }
}
