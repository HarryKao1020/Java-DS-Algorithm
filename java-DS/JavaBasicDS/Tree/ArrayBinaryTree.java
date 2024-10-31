package JavaBasicDS.Tree;

import java.util.ArrayList;
import java.util.List;

public class ArrayBinaryTree {
    private List<Integer> tree;

    // 建構子
    public ArrayBinaryTree(List<Integer> arr){
        tree = new ArrayList<>(arr);
    }

    // 串列容量
    public int size(){
        return tree.size();
    }

    // 獲取索引i節點的值
    public Integer val(int i){
        if(i < 0 || i >= size()){
            return null;
        }
        return tree.get(i);
    }

    // 獲取索引為i節點的左子節點的索引(2i+1)
    public Integer left(int i){
        return 2 * i + 1;
    }
    // 獲取索引為i節點的右子節點的索引(2i+2)
    public Integer right(int i){
        return 2 * i + 2;
    }
    // 獲取索引為i節點的父節點的索引
    public Integer parent(int i ){
        return (i-1) / 2;
    }

    // 層走訪BFS
    public List<Integer> levelOrder(){
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i< size();i++){
            if(val(i) != null){
                res.add(val(i));
            }
        }
        return res;
    }

    // 深度優先走訪DFS
    public void dfs(Integer i , String order , List<Integer> res){
        if(val(i) == null)
            return;

        // 前序走訪
        if("pre".equals(order))
            res.add(val(i));
        dfs(left(i),order,res);

        // 中序走訪
        if("in".equals(order))
            res.add(val(i));
        dfs(right(i),order,res);

        // 後序走訪
        if("post".equals(order))
            res.add(val(i));

    }

    // 前序走訪
    public List<Integer> preOrder(){
        List<Integer> res = new ArrayList<>();
        dfs(0,"pre",res);
        return res;
    }

    // 中序走訪
    public List<Integer> inOrder(){
        List<Integer> res = new ArrayList<>();
        dfs(0,"in",res);
        return res;
    }

    // 後序走訪
    public List<Integer> postOrder(){
        List<Integer> res = new ArrayList<>();
        dfs(0,"post",res);
        return res;
    }


    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        ArrayBinaryTree tree1 = new ArrayBinaryTree(l1);
        System.out.println(tree1.size());
        System.out.println(tree1.left(0));
        System.out.println(tree1.val(tree1.left(0)));

        // 取得節點5(index=4)的父節點index
        System.out.println(tree1.parent(4));
        // 印出節點5的父節點值
        System.out.println(tree1.val(tree1.parent(4)));

        // 前序走訪
        System.out.println(tree1.preOrder());

        // 中序走訪
        System.out.println(tree1.inOrder());

        // 後序走訪
        System.out.println(tree1.postOrder());

    }
}
