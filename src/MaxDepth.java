class MaxDepth {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);
        System.out.println(depth(tree.root));
    }

public static int maxDepth(TreeNode root) {
    int counter = 1;
    if(root.left == null && root.right == null){
        return 1;
    }
    while (root.left != null || root.right != null) {
        if (root.left != null) {
            counter = maxDepth(root.left) + 1;
            return counter;
        } else if (root.right != null) {
            counter = maxDepth(root.right) + 1;
            return counter;
        }
    }
    return counter;
}
public static int depth (TreeNode root){
        if(root == null){
            return 0;
        }
    return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
}
}

