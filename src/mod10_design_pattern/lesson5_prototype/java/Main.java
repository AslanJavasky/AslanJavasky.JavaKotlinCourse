package mod10_design_pattern.lesson5_prototype.java;

public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling"
        );

        Book secondBook =(Book) firstBook.clone();

        secondBook.setTitle("Harry Potter and Chamber of Secret");

        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println(firstBook == secondBook);

    }
}
