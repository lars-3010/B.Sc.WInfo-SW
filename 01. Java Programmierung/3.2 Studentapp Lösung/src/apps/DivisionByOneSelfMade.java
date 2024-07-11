package apps;

public class DivisionByOneSelfMade extends Exception{
    //optionaler Konstruktor mit eigenem Text zur Exception
    public DivisionByOneSelfMade() {
        super("ich verbiete jetzt, dass wir durch 1 teilen.");
        // move the call to the superclass constructor to be the first statement
    }

    public DivisionByOneSelfMade(String errorDescription) {
        super(errorDescription);
    }
}
