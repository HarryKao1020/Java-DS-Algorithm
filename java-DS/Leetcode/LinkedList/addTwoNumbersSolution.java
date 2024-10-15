package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class addTwoNumbersSolution {
    public addTwoNumbersSolution(){

    }
   public static class ListNode {
       int val;
       ListNode next;

       ListNode() {
       }

       ListNode(int val) {
           this.val = val;
       }
   }
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode sentinel = new ListNode(0);

        ListNode result = sentinel;
        int carry = 0;

        while(l1 !=null || l2 !=null || carry!=0){


            /*
	        if(l1 == null){
			      l1.val = 0;
	        }else if(l2 == null){
			      l2.val = 0;
	        }
	        */
            int digit1 = (l1 !=null) ? l1.val :0;
            int digit2 = (l2 != null) ? l2.val :0;

            int sum = digit1+digit2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            // 算出來的值 存到node
            ListNode newNode = new ListNode(digit);
            result.next = newNode;
            result = result.next;
            System.out.println(result.val);
            l1 = (l1!=null) ? l1.next : null;
            l2 = (l2!=null) ? l2.next : null;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(3);
//        LinkedList<Integer> ll1 = new LinkedList<>();
//        ll1.add(1);
//        ll1.add(2);
//        ll1.add(3);
        addTwoNumbersSolution s1 = new addTwoNumbersSolution();
        ListNode result = s1.addTwoNumbers(l1,l2);
        System.out.println(result);
    }
}
