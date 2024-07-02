package apps;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer varStringBuffer = new StringBuffer("Max");
		varStringBuffer.append(" Mustermann");
		System.out.println(varStringBuffer);
		varStringBuffer.delete(0, 3);
		System.out.println(varStringBuffer);
		varStringBuffer.insert(0, "Mia");
		System.out.println(varStringBuffer);
		varStringBuffer.insert(3, "-Maria");
		System.out.println(varStringBuffer);
		System.out.println(varStringBuffer.reverse());
	 }
}
