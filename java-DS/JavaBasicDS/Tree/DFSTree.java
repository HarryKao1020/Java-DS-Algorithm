package JavaBasicDS.Tree;

public class DFSTree {

    // 前序走訪:根節點--> 左子樹 --> 右子樹
    public static void dfs_preOrder(TreeNode node){
        if(node==null) return;
        System.out.println(node.val + " ");

        dfs_preOrder(node.left);
        dfs_preOrder(node.right);
    }

    // 中序走訪:左子樹 --> 根節點 --> 右子樹
    public static void dfs_inOrder(TreeNode node){
        if(node==null) return;

        dfs_inOrder(node.left);
        System.out.println(node.val +' ');
        dfs_inOrder(node.right);
    }

    // 後序走訪:又
    public static void dfs_postOrder(TreeNode node){

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

        // 前序
        dfs_preOrder(root);
    }
}
