package Leetcode.LinkedList;

import java.util.List;

public class RemoveNthNodeFromEndofList_19 {

    public static class ListNode {
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

        public void showAll() {
            ListNode curr = this;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }

        }
    }


    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode res = new ListNode(0, head);
            ListNode dummy = res;

            for (int i = 0; i < n; i++) {
                System.out.println(head.val);
                head = head.next;
            }
            /*
            n=2
            i=0 ; 0 < 2 ; head.val = 1, head=head.next = 2 ;
            i=1 ; 1 < 2 ; head.val = 2 , head = head.next =3;

            */
            while(head!=null){
                System.out.println("dummy:"+dummy.val);
                dummy=dummy.next;
                System.out.println("head:"+head.val);
                head=head.next;
            }
            dummy.next= dummy.next.next;
            System.out.println(dummy.next.val);

            /*
            1.
                head=3
                dummy = dummy.next = 1;
                head = head.next = 4;
            2.
                head=4
                dummy = dummy.next = 2;
                head = head.next = 5;
            3.
                head=5
                dummy = dummy.next = 3;
                head = head.next = null;
            結束while
            dummy.next = dummy.next.next = 5

             */

            return dummy.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution s1 = new Solution();

        ListNode result = s1.removeNthFromEnd(head, 3);
        result.showAll();


    }
}
