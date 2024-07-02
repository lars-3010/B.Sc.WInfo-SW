package apps;

public class StringDemo {

	public static void main(String[] args) {
		String name = "Marisa Fragezeichen";
		
		System.out.println("Zeichen 0: " + name.charAt(0));
		System.out.println("Länge des Namens: " + name.length());
		
		String name2 = "marisa fragezeichen";
		System.out.println("Gleiche Namen bis auf Groß-/Kleinschreibung? " + name2.equalsIgnoreCase(name));
		
		System.out.println("Enthält name das Wort Marisa? " + name.contains("Marisa"));
		System.out.println("Enthält name das Wort Marisa? " + name.contains("Jolanda"));
		
		String name3 = name.concat("-Ausrufungszeichen");
		System.out.println(name3);
		
		System.out.println(getReverse(name3));
		
		System.out.println(getReverse("Mutakirorikatum"));
		
		
		String string1 = "abcde";
		String string2 = "abcde";
		// string1 und string2 haben aufgrund des String Poolings die gleiche Referenz
		
		String string3 = new String("abcde");
		//string 3 bekommt einen eigene Referenz, da die Nutzung von new das String Pooling umgeht
		
		System.out.println(string1 == string2);
		System.out.println(string1 == string3);
		String string4 = "abcd";
		String string5 = null;
		String string6 = string2;       
		System.out.println(string6 == string1);
		

	}
	
	// Method for reverse writing of strings
	private static String getReverse(String string) {
		if (string.length()==0) {
			return "";
		} else {
			return string.charAt(string.length()-1) + getReverse(string.substring(0, string.length()-1));
		}
	}


}
