package mod5_stream.lesson4_optional_class;

import mod5_stream.lesson2_stream_functions.Student;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Alice", 20, 3));
        students.add(new Student("Bob", 22, 4));
        students.add(new Student("Bob", 22, 4));
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

        //collect() для коллекций
        List<Student> studentsAgeMore21 = students.stream()
                .filter(student -> student.getAge() > 21)
                .collect(Collectors.toList());
//              .toList();
        System.out.println(studentsAgeMore21);

        Set<Student> setOfStudentsAgeMore21=students.stream()
                .filter(student -> student.getAge() > 21)
                .collect(Collectors.toSet());
        System.out.println(setOfStudentsAgeMore21);

        LinkedList<Student> linkedlistOfStudentsAgeMore21=students.stream()
                .filter(student -> student.getAge() >21)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedlistOfStudentsAgeMore21);

        Map<String,Integer> mapOfStudents=students.stream()
                .distinct()
                .collect(Collectors.toMap(Student::getName,Student::getAge));
        System.out.println(mapOfStudents);

        //collect() для группировки
        Map<Integer, List<Student>> studentsByCourse=students.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
        System.out.println(studentsByCourse);

        Map<Integer, List<Student>> studentsByAge= students.stream()
                .distinct()
                .collect(Collectors.groupingBy(Student::getAge));
        System.out.println(studentsByAge);

        //partitionBy() для создания 2х групп: старше 20 лет и младше 20 лет
        Map<Boolean, List<Student>> studentsAfterPartitonBy= students.stream()
                .distinct()
                .collect(Collectors.partitioningBy(student -> student.getAge() > 20));
        System.out.println(studentsAfterPartitonBy);

        //partitionBy() для создания 2х групп: старше 3 курса или младше 3го курса
        Map<Boolean, List<Student>> studentsAfterPartitonByCourse= students.stream()
                .distinct()
                .collect(Collectors.partitioningBy(student -> student.getCourse() >= 3));
        System.out.println(studentsAfterPartitonByCourse);


    }
}
