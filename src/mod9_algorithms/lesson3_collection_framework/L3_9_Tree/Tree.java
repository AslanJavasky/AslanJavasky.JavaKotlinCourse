package mod9_algorithms.lesson3_collection_framework.L3_9_Tree;

public class Tree<V extends Comparable<V>> implements ITree<V> {

    private TreeNode<V> root;

    private static class TreeNode<V> {
        V value;
        TreeNode<V> left;
        TreeNode<V> right;

        public TreeNode(V value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public Tree() {
        this.root = null;
    }


    @Override
    public void add(V value) {
        //O(log n)...O(n)
        root = addRec(root, value);
    }

    private TreeNode<V> addRec(TreeNode<V> node, V value) {
        if (node == null) return new TreeNode<>(value);
        if (value.compareTo(node.value) < 0) {
            node.left = addRec(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = addRec(node.right, value);
        }
        return node;
    }

    @Override
    public void remove(V value) {
        //O(log n)...O(n)
        root = removeRec(root, value);
    }

    private TreeNode<V> removeRec(TreeNode<V> node, V value) {
        if (node == null) return null;
        if (value.compareTo(node.value) < 0) {
            node.left = removeRec(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = removeRec(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.value = minValue(node.right);
            node.right = removeRec(node.right, node.value);
        }
        return node;
    }

    private V minValue(TreeNode<V> node) {
        V minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    @Override
    public boolean contains(V value) {
        //O(log n)..O(n)
        return containsRec(root, value);
    }

    private boolean containsRec(TreeNode<V> node, V value) {
        if (node == null) return false;
        if (value.compareTo(node.value) < 0) {
            return containsRec(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            return containsRec(node.right, value);
        } else {
            return true;
        }
    }

    @Override
    public int height() {
        //O(1)..O(n)
        return heightRec(root);
    }

    private int heightRec(TreeNode<V> node) {
        if (node == null) return 0;
        int leftHeight = heightRec(node.left);
        int rightHeight = heightRec(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    @Override
    public void inorderTraversal() {
        //O(n)
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(TreeNode<V> node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.value + " ");
            inorderRec(node.right);
        }
    }

    @Override
    public void preorderTraversal() {
        //O(n)
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(TreeNode<V> node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    @Override
    public void postorderTraversal() {
        //O(n)
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(TreeNode<V> node) {
        if (node != null) {
            preorderRec(node.left);
            preorderRec(node.right);
            System.out.print(node.value + " ");
        }
    }
}
