package mod2_oop.lesson19_comparator;


import java.util.Collections;
import java.util.Comparator;

public class OOPDemo {
    public static void main(String[] args) {

        //Comparable
//        Integer int1=10;
//        Integer int2=16;
//        Integer int3=16;
//
//        System.out.println(int1.compareTo(int2));//-1
//        System.out.println(int2.compareTo(int1));//+1
//        System.out.println(int2.compareTo(int3));//0

//        var student1 = Student.getInstance("Aslan", 33,5);
//        var student2 = Student.getInstance("John", 25,1);
//
//        System.out.println(student1.compareTo(student2));//1
//        System.out.println(student2.compareTo(student1));//-1

//        String str1="a";
//        String str2="z";
//        System.out.println(str1.compareTo(str2));//-25

        //Comparator
        var student1 = Student.getInstance("Aslan", 33, 5);
        var student2 = Student.getInstance("John", 25, 1);

        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.compareTo(s2);
            }
        };
        System.out.println(studentComparator.compare(student1, student2));

//        Collections.sort(array,studentComparator);

    }
}
