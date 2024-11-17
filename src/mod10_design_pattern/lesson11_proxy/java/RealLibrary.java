package mod10_design_pattern.lesson11_proxy.java;

public class RealLibrary implements Library {
    @Override
    public void accessBook(String bookName) {
        System.out.println("Acessing the book: " + bookName);
    }
}
