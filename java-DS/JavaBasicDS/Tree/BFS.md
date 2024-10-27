在二元樹 (Binary Tree) 中實現廣度優先搜尋 (Breadth-First Search, BFS) 主要依賴一個佇列 (Queue) 來逐層遍歷每一個節點。BFS 的目標是從樹的根節點開始，先訪問該層的所有節點，然後再移動到下一層，直到遍歷整棵樹。下面是這個過程的詳細思路和程式碼教學。

### 思考過程

1. **建立佇列**：我們需要一個佇列來儲存每一層的節點。Java 中可以使用 `Queue` 接口的實現 `LinkedList` 來完成佇列操作。

2. **加入根節點**：首先，我們將根節點放入佇列，開始逐層遍歷。

3. **進行迴圈遍歷**：
    - 當佇列不為空時，取出佇列的前端節點（即當前節點），並訪問它（這裡可以打印或處理該節點的值）。
    - 如果當前節點有左子節點，將其加入佇列。
    - 如果當前節點有右子節點，將其加入佇列。

4. **重複步驟 3**：這樣可以確保所有節點都按層級順序被遍歷。

### Java 程式碼範例

以下是實現 BFS 的 Java 程式碼範例：

```java
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTreeBFS {
    
    // BFS traversal method
    public static void bfs(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // 初始化將根節點加入佇列

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll(); // 取出佇列的頭節點
            System.out.print(current.value + " "); // 訪問該節點

            // 若有左子節點，加入佇列
            if (current.left != null) queue.add(current.left);

            // 若有右子節點，加入佇列
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        // 建立範例二元樹
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("BFS traversal of binary tree:");
        bfs(root);
    }
}
```

在這段程式碼中：
- `TreeNode` 類別表示二元樹的每個節點，每個節點包含一個 `value` 和指向左、右子節點的引用。
- `bfs` 方法在 `BinaryTreeBFS` 類中實現 BFS，根據層級遍歷樹並打印每個節點的值。

### 時間和空間複雜度分析

- **時間複雜度**：`O(n)`，因為 BFS 遍歷每個節點一次，其中 `n` 是節點的數量。

- **空間複雜度**：`O(n)`，最壞情況下，佇列中需要儲存整層的節點數量，這在完全二元樹的最底層時可能接近 `n/2`，故空間複雜度是 `O(n)`。