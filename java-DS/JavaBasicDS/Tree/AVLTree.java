package JavaBasicDS.Tree;

public class AVLTree {
    class TreeNode{
        private int val;
        private int height;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }
    TreeNode root ;

    // 獲取節點的高度
    public int height(TreeNode node){
        // 空節點高度為-1 , 葉節點為0
        return node == null ? -1 : node.height;
    }

    // 更新節點高度
    public void updateHeight(TreeNode node){
        //節點高度等於最高子樹高度+1
        node.height = Math.max(height(node.left),height(node.right))+1;
    }

    // 獲取平衡因子
    public int balanceFactor(TreeNode node){

        //空節點平衡因子為0
        if(node == null){
            return 0;
        }
        // 節點平衡因子= 左子樹高度-右子樹高度
        return height(node.left) - height(node.right);
    }

    // 右旋
    private TreeNode rightRotate(TreeNode node){
        TreeNode child = node.left;
        TreeNode grandChild = child.right;

        // 以child為原點,將node向右旋轉
        child.right = node;
        node.left = grandChild;

        // 更新節點高度
        updateHeight(node);
        updateHeight(child);

        return child;
    }

    // 左旋
    private TreeNode leftRotate(TreeNode node){
        TreeNode child = node.right;
        TreeNode grandChild = child.left;

        // 以child為原點,node往左旋轉
        child.left = node;
        node.right = grandChild;

        // 更新節點高度
        updateHeight(node);
        updateHeight(child);

        return child;
    }

    // 先左旋再右旋
    private TreeNode leftRightRotate(TreeNode node){
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    // 先右旋後左旋
    private TreeNode rightLeftRotote(TreeNode node){
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }

    // 旋轉操作選擇
    TreeNode rotate(TreeNode node){
        //
        int balanceFactor = balanceFactor(node);

        // 左偏樹
        if(balanceFactor > 1){
            if(balanceFactor(node.left) >= 0 ){
                // 右旋轉
                return rightRotate(node);
            }else{
                // 先左旋璇後右旋
                return leftRightRotate(node);
            }
        }

        // 右偏樹
        if (balanceFactor < -1) {
            if (balanceFactor(node.right) <= 0) {
                // 左旋
                return leftRotate(node);
            } else {
                // 先右旋後左旋
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        // 平衡樹，無須旋轉，直接返回
        return node;
    }

    // AVL插入節點
    void insert(int val){
        root = insertHelper(root,val);
    }

    TreeNode insertHelper(TreeNode node, int val){
        if(node == null ) return new TreeNode(val);

        if(val < node.val){
            node.left = insertHelper(node.left,val);
        }else if(val > node.val){
            node.right = insertHelper(node.right, val);
        }else{
            return node;
        }

        updateHeight(node);
        node = rotate(node);
        return node;
    }

    /* 刪除節點 */
    void remove(int val) {
        root = removeHelper(root, val);
    }

    /* 遞迴刪除節點（輔助方法） */
    TreeNode removeHelper(TreeNode node, int val) {
        if (node == null)
            return null;
        /* 1. 查詢節點並刪除 */
        if (val < node.val)
            node.left = removeHelper(node.left, val);
        else if (val > node.val)
            node.right = removeHelper(node.right, val);
        else {
            if (node.left == null || node.right == null) {
                TreeNode child = node.left != null ? node.left : node.right;
                // 子節點數量 = 0 ，直接刪除 node 並返回
                if (child == null)
                    return null;
                    // 子節點數量 = 1 ，直接刪除 node
                else
                    node = child;
            } else {
                // 子節點數量 = 2 ，則將中序走訪的下個節點刪除，並用該節點替換當前節點
                TreeNode temp = node.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                node.right = removeHelper(node.right, temp.val);
                node.val = temp.val;
            }
        }
        updateHeight(node); // 更新節點高度
        /* 2. 執行旋轉操作，使該子樹重新恢復平衡 */
        node = rotate(node);
        // 返回子樹的根節點
        return node;
    }

    // 中序遍歷
    public void inorder(){
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(TreeNode node){
        if(node != null){
            inorderRec(node.left);
            System.out.print(node.val + " ");
            inorderRec(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree avt1 = new AVLTree();
        for(int i =0;i<10;i++){
            avt1.insert(i);
        }
        avt1.insert(30);
        avt1.insert(20);
        avt1.remove(8);
        avt1.inorder();
    }
}
