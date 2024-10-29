package JavaBasicDS.Tree;


public class BST {


    public static void main(String[] args) {
//      初始化節點
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(4);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right=new TreeNode(6);
        root.right.left=new TreeNode(8);
        root.right.right=new TreeNode(11);



    }
}
