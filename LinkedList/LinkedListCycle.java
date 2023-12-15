package LeetCode150.LinkedList;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int data) {
        val = data;
    }
}

public class LinkedListCycle {
    public static boolean linkedListCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
