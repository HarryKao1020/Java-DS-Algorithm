package JavaBasicDS.Tree;


public class BST {

    static class BinarySearchTree{
        TreeNode root ;
        public BinarySearchTree() {
            root = null;
        }

        // 插入新節點
        public void insert(int num) {
            // 若樹為空，則初始化根節點
            if (root == null) {
                root = new TreeNode(num);
                return;
            }
            TreeNode cur = root, pre = null;
            // 迴圈查詢，越過葉節點後跳出
            while (cur != null) {
                // 找到重複節點，直接返回
                if (cur.val == num)
                    return;
                pre = cur;

                // 插入位置在 cur 的右子樹中
                if (cur.val < num)
                    cur = cur.right;
                    // 插入位置在 cur 的左子樹中
                else
                    cur = cur.left;
            }

            // 插入節點
            TreeNode node = new TreeNode(num);
            if (pre.val < num)
                pre.right = node;
            else
                pre.left = node;
        }

        // 查詢節點
        public TreeNode search(int num){
            TreeNode cur = root;
            // 迴圈查詢，越過葉節點後跳出
            while (cur != null) {
                // 目標節點在 cur 的右子樹中
                if (cur.val < num)
                    cur = cur.right;
                    // 目標節點在 cur 的左子樹中
                else if (cur.val > num)
                    cur = cur.left;
                    // 找到目標節點，跳出迴圈
                else
                    break;
            }
            // 返回目標節點
            return cur;
        }

        //刪除節點 , 要考慮度是多少(有多少個子節點)
        public void remove(int num){
            // 如果樹為空,直接返回
            if(root == null){
                return;
            }

            TreeNode cur = root , pre = null;

            // 迴圈查詢,越過葉節點後跳出
            while (cur != null){
                if(cur.val == num){
                    break;
                }

                pre = cur;

                // 待刪除的節點在右邊子樹
                if(cur.val < num){
                    cur = cur.right;
                }else{
                    // 待刪除的節點在左邊子樹
                    cur = cur.left;
                }
            }

            // 如果沒有待刪除的節點直接跳出
            if(cur == null){
                return;
            }

            // 子節點=0 or 1(度=0 or 1)
            if(cur.right ==null || cur.left ==null){
                // 如果左子節點不是null ,child = 左子節點 ,否則child=右子節點
                TreeNode child = cur.left !=null ? cur.left : cur.right;

                if(cur != root){
                    if(pre.left == cur)
                        pre.left = child;
                    else
                        pre.right = child;
                }else {
                    root = child;
                }
            // 子節點有2個(度=2)
            }else{
                TreeNode temp = cur.right;
                while(temp.left !=null){
                    temp = temp.left;
                }
                // 遞迴刪除節點 temp
                remove(temp.val);

                // 用temp覆蓋cur
                cur.val = temp.val;
            }
        }

        // 中序遍歷 , 會是升序排列
        public void inorderTraversal(){
            inorderRecursive(root);
        }

        // inorder
        private void inorderRecursive(TreeNode node){
            if (node != null){
                inorderRecursive(node.left);
                System.out.print(node.val + " ");
                inorderRecursive(node.right);
            }
        }
    }

    public static void main(String[] args) {
//      初始化節點
        BinarySearchTree bst = new BinarySearchTree();
        // 插入節點
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        /*
                  50
               /      \
              30      70
             /  \    /  \
            20   40  60  80
        */

        bst.inorderTraversal();

        bst.remove(30);
        bst.inorderTraversal();




    }
}
