package ExceptionHomeWorkThree;

public class GenderException extends RuntimeException{
    public GenderException() {
        super("Incorrect entered gender");
    }
}
