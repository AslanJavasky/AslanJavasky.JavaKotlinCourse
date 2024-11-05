package mod9_algorithms.lesson3_collection_framework.L3_9_Tree;

public class Main {
    public static void main(String[] args) {

        //Бинарное дерево
        ITree<Integer> tree=new Tree<>();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);

        System.out.println("in-order traversal: ");
        tree.inorderTraversal();

        System.out.println("pre-order traversal: ");
        tree.preorderTraversal();

        System.out.println("post-order traversal: ");
        tree.postorderTraversal();
        System.out.println();

        //суффиксное дерево
        //Aslan -> Aslan, slan, lan, la, a
        SuffixTree st=new SuffixTree("Aslan is the best teacher!");
        System.out.println(st.search("lan"));
        System.out.println(st.search("dshjgfsdjhgf"));
        System.out.println(st.search("n is the be"));
        System.out.println(st.search("John is the student"));
    }
}
