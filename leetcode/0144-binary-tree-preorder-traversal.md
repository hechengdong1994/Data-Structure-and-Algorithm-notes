# binary-tree-preorder-traversal

https://leetcode-cn.com/problems/binary-tree-preorder-traversal/


## 1 递归



```java
public List<Integer> preorderTraversal(TreeNode root) {
    if (root==null){
        return new ArrayList<>();
    }

    List<Integer> result = new ArrayList<>();
    result.add(root.val);
    result.addAll(preorderTraversal(root.left));
    result.addAll(preorderTraversal(root.right));
    return result;
}
```



## 2 迭代



```java
public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        for (; !stack.isEmpty() || root != null; ) {
            if (root != null) {
                result.add(root.val);
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                root = root.right;
            }
        }
        return result;
    }
```


