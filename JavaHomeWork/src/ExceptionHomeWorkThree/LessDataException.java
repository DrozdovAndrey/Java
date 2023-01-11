package ExceptionHomeWorkThree;

public class LessDataException extends RuntimeException{
    public LessDataException() {
        super("you entered less data than required");
    }
}
