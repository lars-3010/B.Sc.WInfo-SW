package apps;
import model.Weekday;

public class WeekdayDemo {
    
    public static void main(String[] args) {
        Weekday day = Weekday.TUESDAY;
        System.out.println("The day is " + day);
        System.out.println("The german name is " + day.getGermanName());
        System.out.println("It is the " + day.getDayNumber()+". day of the week.");
        System.out.println("Interne Zählung: "+ day + " ist: "+day.ordinal() + " days have passed since Monday.");
}
}