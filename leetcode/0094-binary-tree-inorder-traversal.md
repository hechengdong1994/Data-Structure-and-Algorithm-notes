# binary-tree-inorder-traversal

https://leetcode-cn.com/problems/binary-tree-inorder-traversal/


## 1 遍历



```java
public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null) {
        return new ArrayList<>();
    }
    List<Integer> result = new ArrayList<>();
    result.addAll(inorderTraversal(root.left));
    result.add(root.val);
    result.addAll(inorderTraversal(root.right));
    return result;
}
```



## 2 迭代



```java
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    for (; !stack.isEmpty() || root != null; ) {
        if (root != null) {
            stack.push(root);
            root = root.left;
        } else {
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
    }
    return result;
}
```


