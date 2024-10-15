package Leetcode.LinkedList;

public class MergeTwoSortedLists {

//     Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    static class Solution{
// Solution 1 .
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode head = new ListNode(0);
//            ListNode dummy = head;
//
//            while(list1 != null && list2 !=null){
//                if(list1.val <= list2.val){
//                    System.out.println("list1:"+list1.val);
//                    dummy = list1;
//                    list1 = list1.next;
//                }else {
//                    System.out.println("list2:" + list2.val);
//                    dummy = list2;
//                    list2 = list2.next;
//                }
//                dummy = dummy.next;
//            }
//            if(list1 ==null){
//                dummy = list2;
//            }else{
//                dummy = list1;
//            }
//            System.out.println("dummy:"+dummy.val);
//            System.out.println(head.next.val);
//            head.next= dummy;
//            return head.next;
//
//
//        }
        public ListNode mergeTwoLists(ListNode list1,ListNode list2) {

            //list1 =[] , list2 =[] ,return []
            //list1 =[0] , list2=[] , return [0]
            //list1 = [] , list2=[0] , return [0]
            /*
            list1 = [1,2,4] , list2=[1,3,4] , return [1,1,2,3,4,4]
            1.list1[0]  <= list2[0]  ---> list1.next =  mergeTwoLists(list1.next,list2)
            2.list1[1] <= list2[0] ---> list2.next mergeTwoList2(list1,list2.next)
            3.list1[1] <= list2[1] ---> list1.next mergeTwoLists(list1.next,list2)
            4.list1[2] <= list2[1] ---> list2.next mergeTwoList2(list1,list2.next)
            5.list1[2] <= list2[2] ---> list1.next mergeTwoLists(list1.next,list2)
            6.list1 =null <= list2[2] ---> return list2



            */


            if(list1 !=null && list2 !=null){
                if(list1.val <= list2.val){
                    list1.next = mergeTwoLists(list1.next,list2);
                    System.out.println(list1.val);
                    System.out.println(list1.next.val);
                    return list1;
                }else{
                    list2.next = mergeTwoLists(list1,list2.next);
                    System.out.println(list2.val);
                    System.out.println(list2.next.val);
                    return list2;
                }

            }

            if(list1 ==null){
                System.out.println("last step:"+ list2.val);
                return list2;
            }
            System.out.println("last second step : "+ list1.val);
            return list1;

        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next= new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println(s1.mergeTwoLists(list1,list2));

//        ListNode head = new ListNode(-1);
//        ListNode temp = head;
//        temp.next = new ListNode(1);
//        System.out.println(temp.val);

    }
}
