在二元樹的深度優先搜尋 (DFS) 中，主要有三種常見的遍歷方式：前序 (Pre-order)、中序 (In-order) 和後序 (Post-order) 走訪。這三種走訪方法遵循不同的順序來處理每個節點。以下是每種方法的程式碼和時間、空間複雜度分析。

### 1. 前序走訪 (Pre-order Traversal)
前序走訪的順序是：**根節點 -> 左子樹 -> 右子樹**。

```java
public void preOrder(TreeNode node) {
    if (node == null) return;

    System.out.print(node.value + " "); // 訪問根節點
    preOrder(node.left); // 遍歷左子樹
    preOrder(node.right); // 遍歷右子樹
}
```
```text
tree:
       1
   2      3
 4   5   6   7
 
1 --> 2 --> 4 --> 5 --> 3 --> 6 ---> 7
```



### 2. 中序走訪 (In-order Traversal)
中序走訪的順序是：**左子樹 -> 根節點 -> 右子樹**。

```java
public void inOrder(TreeNode node) {
    if (node == null) return;

    inOrder(node.left); // 遍歷左子樹
    System.out.print(node.value + " "); // 訪問根節點
    inOrder(node.right); // 遍歷右子樹
}
```

```text
tree:
       1
   2      3
 4   5   6   7
 
1 -->  --> 4 --> 5 --> 3 --> 6 ---> 7
```

### 3. 後序走訪 (Post-order Traversal)
後序走訪的順序是：**左子樹 -> 右子樹 -> 根節點**。

```java
public void postOrder(TreeNode node) {
    if (node == null) return;

    postOrder(node.left); // 遍歷左子樹
    postOrder(node.right); // 遍歷右子樹
    System.out.print(node.value + " "); // 訪問根節點
}
```

### 時間和空間複雜度分析

- **時間複雜度**：所有三種 DFS 走訪方法的時間複雜度均為 `O(n)`，因為每個節點都被訪問一次。

- **空間複雜度**：
    - 最佳情況為 `O(log n)`，當樹是平衡二元樹時，遞迴棧的深度會等於樹的高度。
    - 最壞情況為 `O(n)`，當樹是線性結構（例如單一鏈狀）時，遞迴棧會達到 `n` 的深度。