package mod3_exception.lesson5_custom_exception;

public class CustonExceptionDemo {
    public static void main(String[] args) throws CourseIsNotValidException, StudentException {

        try{
            var student1 = Student.getInstance("Aslan");
            if (student1.getCourse() < 1) {
                throw new CourseIsNotValidException("Course must be greater or equal 1");
            }
        }catch (CourseIsNotValidException e){
            System.out.println(e);
        }

        throw new StudentException();
//        throw new StudentException("Something went wrong...");



    }
}
