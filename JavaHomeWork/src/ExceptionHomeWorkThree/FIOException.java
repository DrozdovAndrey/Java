package ExceptionHomeWorkThree;

public class FIOException extends RuntimeException{
    public FIOException() {
        super("Incorrect entered FIO");
    }
}
