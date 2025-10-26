public class InsertGreatestCommonDivisorsInLinkedList {

    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }

        public ListNode insertGreatestCommonDivisors(ListNode head) {
            if (head.next == null) return head;
            ListNode listNode1 = head;
            ListNode listNode2 = head.next;
            while (listNode2.next != null){
                listNode1.next = new ListNode(gcd(listNode1.val, listNode2.val), listNode2);
                listNode1=listNode2;
                listNode2=listNode2.next;
            }
            return head;
        }
    }
}
