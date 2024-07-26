package mod2_oop.lesson17_inner_class;

public class OuterClass {

    private int outerField;

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {

        private int innerField;

        public void innerMethod() {
            outerField = 10;
            outerMethod();
            System.out.println("Inner method, outerField = " + outerField);
        }
    }
}
