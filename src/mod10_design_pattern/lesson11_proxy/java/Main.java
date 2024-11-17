package mod10_design_pattern.lesson11_proxy.java;

public class Main {
    public static void main(String[] args) {

//        Library lib = new RealLibrary();
//        lib.accessBook("Defence Against the Dark Arts.");

//        Library lib=new ProxyLibrary("student");
        Library lib = new ProxyLibrary("muggle");
        lib.accessBook("Defence Against the Dark Arts");

    }
}
