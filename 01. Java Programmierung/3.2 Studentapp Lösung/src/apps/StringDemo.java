package apps;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Marisa Fragezeichen";
        System.out.println("Zeichen 0 " + name.charAt(0));
        System.out.println("Länge des Namens " + name.length());

        String name2 = "Marisa Fragezeichen";
        System.out.println("Vergleich von name und name2 bis auf Groß-/Kleinschreibung " + name2.equalsIgnoreCase(name));
        System.out.println("Enthält name das Wort Marisa? " + name.contains("Marisa"));
        System.out.println("Enthält name das Wort Marisa? " + name.contains("Jolanda"));

        String name3 = name.concat("-Ausrufungszeichen");
        System.out.println(name3);

        System.out.println(getReverse(name3));
    }
    // Method for reverse writing of strings
    public static String getReverse(String string) {
        if (string.length() == 0) {
            return "";
        } else {
            return string.charAt(string.length() - 1) + getReverse(string.substring(0, string.length() - 1));
        }
    
    }
    public static void main2(String[] args) {
        String string1 = "abcde";
        String string2 = "abcde";
        String string3 = new String("abcde");
        System.out.println(string1 == string2);
        System.out.println(string1 == string3);
        String string4 = "abcd";
        String string5 = null;
        String string6 = string2;
        System.out.println(string6 == string1);
    }
}