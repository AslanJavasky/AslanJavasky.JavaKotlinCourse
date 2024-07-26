package mod2_oop.lesson17_inner_class;

public class InnerDemo {
    public static void main(String[] args) {

        var outerClass = new OuterClass();
        outerClass.outerMethod();
//        outerClass.outerField;
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerMethod();

        var husband=new Husband();
        Husband.Wife wife;

        wife=husband.new Wife();





    }
}
