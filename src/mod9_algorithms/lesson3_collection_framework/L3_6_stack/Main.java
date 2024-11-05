package mod9_algorithms.lesson3_collection_framework.L3_6_stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack=new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack.peek());
        stack.pop();

        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}
