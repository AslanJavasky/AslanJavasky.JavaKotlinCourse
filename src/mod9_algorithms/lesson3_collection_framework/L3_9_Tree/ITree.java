package mod9_algorithms.lesson3_collection_framework.L3_9_Tree;

public interface ITree<V> {
    void add(V value);
    void remove(V value);
    boolean contains(V value);
    int height();
    void inorderTraversal();
    void preorderTraversal();
    void postorderTraversal();
}
