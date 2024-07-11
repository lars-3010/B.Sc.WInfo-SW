package apps;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int a = 37;
        int b = 5;
        int c;
        int rest;
        try {
            c = a / b;
            rest = a-c*b;
            System.out.println("Ergebnis: " + a + ":" + b + " = " + c + " Rest: " + rest);
        } catch (Exception e) {
            System.out.println("Fehler eingetreten, Exception lautet: " +e);
        } finally {
            System.out.println("Das Programm wurde beendet. Dieer satz wird immer ausgegeben!");
        }
    }
}
