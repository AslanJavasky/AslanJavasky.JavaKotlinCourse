package mod10_design_pattern.lesson11_proxy.java;

public class ProxyLibrary implements Library {

    private RealLibrary realLibrary;
    private String userRole;

    public ProxyLibrary(String userRole) {
        this.userRole = userRole;
        realLibrary = new RealLibrary();
    }

    @Override
    public void accessBook(String bookName) {
        if (hasAccess()) {
            realLibrary.accessBook(bookName);
        } else {
            System.out.println("Access denied to the the book: " + bookName + ".Unsufficient permissions.");
        }
    }

    private boolean hasAccess() {
        return userRole.equalsIgnoreCase("student")
                || userRole.equalsIgnoreCase("professor");
    }
}
