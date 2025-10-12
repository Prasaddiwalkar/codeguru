package code.codeguru.interview.tree;

public class Tree {

    private TreeNode root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }
        if (((Comparable) current.value).compareTo(value) > 0) {
            current.left = addRecursive(current.left, value);
        } else if (((Comparable) current.value).compareTo(value) < 0) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public int length() {
        return length(root);
    }

    private int length(TreeNode current) {
        if (current == null) {
            return 0;
        }
        return 1 + length(current.left) + length(current.right);
    }

    public int count() {
        return count(root);
    }

    private int count(TreeNode current) {
        if (current == null) {
            return 0;
        }
        return 1 + count(current.left) + count(current.right);
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode current) {
        if (current == null) {
            return 0;
        }
        return 1 + Math.max(height(current.left), height(current.right));
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode mirrorTree(TreeNode node) {
        if (node == null) {
            return null;
        }

        // Swap the left and right children
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively mirror the left and right subtrees
        mirrorTree(node.left);
        mirrorTree(node.right);

        return node;
    }

    public TreeNode find(int value) {
        return findRecursive(root, value);
    }

    public TreeNode findRecursive(TreeNode current, int value) {
        if (current == null) {
            return null;
        }
        if (((Comparable) current.value).compareTo(value) == 0) {
            return current;
        }
        return ((Comparable) current.value).compareTo(value) > 0
                ? findRecursive(current.left, value)
                : findRecursive(current.right, value);
    }

    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void levelOrderTraversal() {
        int h = height();
        for (int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }

    private void printGivenLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.value + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public void prettiPrint(TreeNode node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.print(prefix + (isLeft ? "├── " : "└── ") + node.value + "\n");
            prettiPrint(node.left, prefix + (isLeft ? "│   " : "    "), true);
            prettiPrint(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}
