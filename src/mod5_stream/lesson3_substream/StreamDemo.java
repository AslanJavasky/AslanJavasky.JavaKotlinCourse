package mod5_stream.lesson3_substream;

import mod5_stream.lesson2_stream_functions.Student;

import java.util.List;
import java.util.ArrayList;
import java.util.OptionalDouble;
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
        students.add(new Student("Noah", 22, 4));
        students.add(new Student("Olivia", 21, 3));
        students.add(new Student("David", 19, 2));
        students.add(new Student("Emma", 20, 3));
        students.add(new Student("Frank", 22, 4));
        students.add(new Student("Grace", 21, 3));
        students.add(new Student("Helena", 19, 2));
        students.add(new Student("Isabella", 20, 3));
        students.add(new Student("Jack", 22, 4));

        List<Student> studentsAfterSkip = students.stream()
                .skip(5)//пропустить первые 5 элементов
                .toList();
        System.out.println(studentsAfterSkip);

        List<Student> studentsAfterLimit = students.stream()
                .limit(6)//оставить первые 6 элементов
                .toList();
        System.out.println(studentsAfterLimit);

        //peek()
        List<String> modifiedNames = students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .peek(name -> System.out.println("peek()=" + name))
                .toList();
        System.out.println(modifiedNames);

        //concat()
        var stream1=students.stream().map(Student::getName). limit(4);
        var stream2= Stream.of("Aslan","Aslan", "Ivan", "Vladimir");
        List<String> namesAfterConcat= Stream.concat(stream1,stream2).distinct().toList();
        System.out.println(namesAfterConcat);

    }
}
