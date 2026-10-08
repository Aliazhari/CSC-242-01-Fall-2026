public class StackOverflowException extends Exception {

    public StackOverflowException() {
        super("Stack Overflow");
    }

    public StackOverflowException(String msg) {
        super(msg);
    }
    
}
