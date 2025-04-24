package ch11.sec06;

public class InsufficientException extends Exception {
    public InsufficientException(){}

    public InsufficientException(String msg){
        super(msg);
    }
}
