package mod5_stream.lesson5_collect;

import mod5_stream.lesson2_stream_functions.Student;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Alice", 20, 3));
        students.add(new Student("Bob", 22, 4));
        students.add(new Student("Charlie", 21, 3));
        students.add(new Student("Katherine", 21, 3));
        students.add(new Student("Liam", 19, 2));
        students.add(new Student("Mia", 20, 3));
        students.add(new Student("Noah", 18, 4));
        students.add(new Student("Olivia", 21, 3));
        students.add(new Student("David", 19, 2));
        students.add(new Student("Emma", 20, 3));
        students.add(new Student("Frank", 22, 4));
        students.add(new Student("Grace", 21, 3));
        students.add(new Student("Helena", 19, 2));
        students.add(new Student("Isabella", 20, 3));
        students.add(new Student("Jack", 22, 4));

//        Optional<Student> studentOptional=Optional.ofNullable(null);
////        System.out.println(student1.isPresent());
//        if (!studentOptional.isPresent()){
//            System.out.println(studentOptional.orElse(new Student("Aslan")));
//        }

        //1 способ
//        Optional<Student> youngestStudent=students.stream()
//                .min(Comparator.comparing(Student::getAge));
        //2 способ
        Optional<Student> youngestStudent=students.stream()
                .min((s1,s2) -> Integer.compare(s1.getAge(),s2.getAge()));

        if (youngestStudent.isPresent()){
            System.out.println("The youngest student is "+youngestStudent.get());
        }else {
            System.out.println("The youngest student is null. The default student is "+
                    youngestStudent.orElse(new Student("Aslan")));
        }


        Optional<Student> oldestStudent=students.stream()
                .max(Comparator.comparing(Student::getAge));

        if (oldestStudent.isPresent()){
            System.out.println("The oldest student is "+oldestStudent.get());
        }else {
            System.out.println("The oldest student is null. The default student is "+
                    oldestStudent.orElse(new Student("Aslan")));
        }


    }
}
