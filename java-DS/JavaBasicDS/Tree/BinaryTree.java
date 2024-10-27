package JavaBasicDS.Tree;

import java.util.Objects;


public class BinaryTree {


    public static void main(String[] args) {
//      初始化節點
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6=new TreeNode(6);

        // 建構節點的pointer
        n1.left=n2;
        n1.right=n3;
        n2.left = n4;
        n2.right= n5;


//      插入結點在n1跟n2之間
        TreeNode p = new TreeNode(0);
        n1.left = p;
        p.left = n2;

//      刪除節點,刪除某節點會連帶刪除節點的葉節點
        n1.left = n2;

//

    }
}
