package mod9_algorithms.lesson3_collection_framework.L3_9_Tree;

import java.util.HashMap;
import java.util.Map;

public class SuffixTree {

    private final String text;
    private final SuffixTreeNode root;


    private static class SuffixTreeNode {
        Map<Character, SuffixTreeNode> children;
        int start;
        int end;
        int suffixIndex;

        public SuffixTreeNode() {
            children = new HashMap<>();
            start = -1;
            end = -1;
            suffixIndex = -1;
        }
    }

    public SuffixTree(String text) {
        this.text = text;
        this.root = new SuffixTreeNode();
        buildSuffixTree();
    }

    private void buildSuffixTree() {
        //O(n)
        for (int i = 0; i < text.length(); i++) {
            insertSuffix(i);
        }
    }

    private void insertSuffix(int suffixIndex) {
        SuffixTreeNode current = root;
        int startIndex = suffixIndex;
        int textLenght = text.length();

        for (int i = startIndex; i < textLenght; i++) {
            char character = text.charAt(i);
            if (current.children.containsKey(character)) {
                current = current.children.get(character);
            } else {
                SuffixTreeNode newNode = new SuffixTreeNode();
                newNode.start = suffixIndex;
                newNode.end = textLenght;
                current.children.put(character, newNode);
                current = newNode;
            }
        }
        current.suffixIndex = suffixIndex;
    }


    public boolean search(String pattern) {
        //O(n), где n- колво символов в искомой строке(pattern)
        SuffixTreeNode current = root;
        int index = 0;
        int patternLenght = pattern.length();

        while (index < patternLenght) {
            char charToFind = pattern.charAt(index);
            if (current.children.containsKey(charToFind)) {
                current = current.children.get(charToFind);
                index++;
            }else {
                return false;
            }
        }
        return true;
    }


}
