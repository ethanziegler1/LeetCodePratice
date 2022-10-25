class BinaryTree {
    // Root of Binary Tree
    TreeNode root;

    BinaryTree() {
        root = null;
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(TreeNode node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.val + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }
}