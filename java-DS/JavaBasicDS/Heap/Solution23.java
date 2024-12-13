package JavaBasicDS.Heap;

import java.util.Iterator;
import java.util.PriorityQueue;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        // 虛擬頭節點
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        // 創建優先級隊列（最小堆）
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length, (a, b) -> (a.val - b.val)
        );

        // 初始化步驟：將每個鏈表的頭節點加入優先隊列
        System.out.println("題目:[[1,4,5],[1,4,3],[2,6]");
        System.out.println("初始化：將每個鏈表的頭節點加入優先隊列");
        for(ListNode head : lists){
            if(head != null){
                pq.offer(head);
                System.out.println("加入節點: " + head.val);
            }
        }

        // 追蹤合併過程
        System.out.println("\n開始合併過程：");
        int step = 1;

        while(!pq.isEmpty()){
            // 從優先隊列中取出最小的節點
            ListNode node = pq.poll();
            System.out.println("步驟 " + step + ": 取出最小節點 " + node.val);

            // 將節點接到結果鏈表中
            p.next = node;
            p = p.next;

            // 如果當前節點還有下一個節點，將其加入優先隊列
            if(node.next != null){
                pq.offer(node.next);
                System.out.println("  > 加入下一個節點 " + node.next.val + " 到優先隊列");
            }

            // 列出當前優先隊列的狀態
            System.out.print("  > 當前優先隊列: [");
            Iterator<ListNode> iterator = pq.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next().val + " ");
            }
            System.out.println("]");

            // 列出當前已合併的鏈表
            System.out.print("  > 當前已合併鏈表: ");
            ListNode current = dummy.next;
            while(current != null){
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null\n");

            step++;
        }

        return dummy.next;
    }

    // 幫助方法：打印鏈表
    public void printList(ListNode head) {
        System.out.print("鏈表: ");
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Solution23 solution = new Solution23();

        // 創建測試鏈表
        ListNode list1 = createList(new int[]{1, 4, 5});
        ListNode list2 = createList(new int[]{1, 3, 4});
        ListNode list3 = createList(new int[]{2, 6});

        ListNode[] lists = {list1, list2, list3};

        // 合併鏈表
        ListNode result = solution.mergeKLists(lists);
    }

    // 輔助方法：創建鏈表
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for(int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
}
