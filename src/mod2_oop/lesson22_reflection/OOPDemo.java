package mod2_oop.lesson22_reflection;


import java.lang.reflect.*;

public class OOPDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //Class
        Student studentAslan = new Student("Aslan Javasky");


        Class<? extends Student> studentClass = studentAslan.getClass();

        Class<Student> studentClass1 = Student.class;

        Class<?> studentClass2 = Class.forName("mod2_oop.lesson22_reflection.Student");

        System.out.println(studentAslan.getClass().getName());

        //SuperClass
        Class<?> superClass = studentAslan.getClass().getSuperclass();

        //Modifier
        var accessModifier = Modifier.toString(studentClass.getModifiers());
        System.out.println(accessModifier);

        //Constructor[]
        var constructorsOfStudentClass = studentClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructorsOfStudentClass) {
            System.out.println(constructor);
        }

        //Method[]
        Method[] methods=studentClass.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method);
//            System.out.println(method.getReturnType());
        }

        //Field[]
        Field[] fields=studentClass.getDeclaredFields();//course
//        Field[] fields=studentClass.getFields();//KIND
        for (Field field:fields){
            System.out.println(field);
        }

        //example
        Class
                .forName("mod2_oop.lesson22_reflection.Student")
                .getMethod("sayHello")
                .invoke(studentAslan);


    }
}
