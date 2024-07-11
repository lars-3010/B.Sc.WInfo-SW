package model;

public class IdRangeException extends Exception{
    //optionaler Konstruktor mit eigenem Text zur Exception
    public IdRangeException() {
        super("Diese ID ist auserhalb des vorgegebenen Rahmen.");
        // move the call to the superclass constructor to be the first statement
    }

    public IdRangeException(String errorDescription) {
        super(errorDescription);
    }
}

