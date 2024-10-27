package JavaBasicDS.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTree {

    // BFS(廣度優先搜尋法)
    public static void bfs(TreeNode root){
        if(root==null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.println(current.val +" ");


            if(current.left!=null){
                queue.offer(current.left);
            }

            if(current.right!=null){
                queue.offer(current.right);
            }
        }

    }


    public static void main(String[] args) {
        // 初始化二元樹
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6=new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        root.left = n2;
        root.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;


        // BFS遍歷
        bfs(root);

    }


}
