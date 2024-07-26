package mod3_exception.lesson5_custom_exception;

public class CourseIsNotValidException extends Exception {

    public CourseIsNotValidException() {
    }

    public CourseIsNotValidException(String message) {
        super(message);
    }
}
