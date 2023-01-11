package ExceptionHomeWorkThree;

public class LotsDataException extends RuntimeException{
    public LotsDataException() {
        super("you entered lots of data than required");
    }
}
