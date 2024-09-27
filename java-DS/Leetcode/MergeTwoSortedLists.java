package Leetcode;

import java.util.List;

public class MergeTwoSortedLists {

//     Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode head = new ListNode(0);
            ListNode dummy = head;

            while(list1 != null && list2 !=null){
                if(list1.val <= list2.val){
                    System.out.println("list1:"+list1.val);
                    dummy = list1;
                    list1 = list1.next;
                }else {
                    System.out.println("list2:" + list2.val);
                    dummy = list2;
                    list2 = list2.next;
                }
                dummy = dummy.next;
            }
            if(list1 ==null){
                dummy = list2;
            }else{
                dummy = list1;
            }
            System.out.println("dummy:"+dummy.val);
            System.out.println(head.next.val);
            head.next= dummy;
            return head.next;


        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next= new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode();
//        list2.next = new ListNode(3);
//        list2.next.next = new ListNode(4);
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        temp.next = new ListNode(1);
        System.out.println(temp.val);

    }
}
