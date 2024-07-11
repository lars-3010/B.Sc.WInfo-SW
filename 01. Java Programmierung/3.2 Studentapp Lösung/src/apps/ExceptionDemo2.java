package apps;

public class ExceptionDemo2 {
    public static void main(String[] args) throws DivisionByOneSelfMade{
        //Demo, die bei Ausführeng eine Exception bzgl. des Teilen durch 1 anzeigt
        int zaeler=30;
        int nenner=1;

        if (nenner== 1) {
            throw new DivisionByOneSelfMade();
        } else {
            System.out.println(zaeler/nenner);
        }
    }
}
