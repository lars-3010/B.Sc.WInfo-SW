package apps;

public class ArrayApp {
	
	public static void main(String[] args) {
		
		int[] array1 = new int[4];
		int[] array2 = new int[] {1, 1, 2, 3, 5, 8};
		int[] array3 = null;
		int[] array4 = getArray(10);
		
		printArray(array1);
		printArray(array2);
		printArray(array3);
		printArray(array4);
		
		printIntegerValues(array1);
		printIntegerValues(array2);
		printIntegerValues(array3);
		
		array4[1] = 3;
		printArray(array4);
		
		int[] array5 = getCopy(array2);
		printArray(array2);
		
		array4[9] = array5[0];
		array4[8] = array5[1];
		array4[7] = array5[2];
		array4[6] = array5[3];
		
		printArray(array4);
		
		//Test getLastValue
		System.out.println("Test getLastValue");
		System.out.println(getLastValue(array4));
		System.out.println(getLastValue(1,2,34,66,98));
		
		// Kopieren von Arrays mit getCopy
		int[] array6 = new int[] { 1, 3, 5, 7, 11, 13, 17, 19 };
		int[] array7 = getCopy(array6);
		printIntegerValues(array6);
		printIntegerValues(array7);
		
		System.out.println(array6 == array7);
		
		int[] array9 = array2.clone();
		printIntegerValues(array2);
		printIntegerValues(array9);
		System.out.println("Array9: " + array9 + "\nArray2: " + array2);


		//Test der Methoden aus Übung 5.1
		System.out.println("\n\nÜbung 5.1:\n");
		System.out.println(getSum(1,2,3,4,5));
		System.out.println(getMean(1,2,3,4,5));	
		
		
		// Test der Methoden aus Hausübung 5.2
		//
		// Test getReverse(int[] array)
		System.out.println("\n\nHausübung 5.2:\n");
		int[] array9rev = getReverse(array9);
		printIntegerValues(array9);
		printIntegerValues(array9rev);
		
		printIntegerValues(getReverse(new int[] {1,2,3,4,5}));
		printIntegerValues(getReverse(null));
		 
		//Test isEqual
		int[] array10 = new int[] {1,2,3,4,5};
		int[] array11 = new int[] {1,1,3,4,5};
		boolean[] arraysEqu = isEqual(array10, array11);
		
		for(boolean k : arraysEqu){
			System.out.print(k + "\t");
		}
		
		//Test isSymmetric
		boolean testSym1 = isSymmetric(new int[] {1,2,3,5,3,2,1});
		System.out.println("\ntestSym1 ist symmetrisch? " + testSym1);
		
		boolean testSym2 = isSymmetric(new int[] {9,3,9,0});
		System.out.println("testSym2 ist symmetrisch? " + testSym2);	
		
	} // end of main
	
	private static int[] getArray(int size) {
		return new int[size];
	}
	
	private static void printArray(int[] array) { 
		if (array != null) { 
			for (int value: array) { 
				System.out.print(" " + value); 
	  		} 
	  		System.out.println(); 
	  	}
	  	else {
	  		System.out.println("*** No array available ***");
	  	} 
	}
	 

	private static void printIntegerValues(int... values) {
		if (values == null) {
			System.out.println("*** No array available ***");
		} else {
			for (int value : values) {
				System.out.print(" " + value);
			}
			System.out.println();
		}
	}
	
	private static int[] getCopy(int[] array) {
		if (array == null) {
			return null;
		}

		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
	
	private static int getLastValue(int... values) {
		return values[values.length-1];
	}
	
	
	//Lösung von Übung 5.1
	private static int getSum(int... summands) {
		int result = 0;
		for (int number : summands) {
			result += number;
		}
		return result;
	}

	private static double getMean(int... numbers) {
		return numbers.length == 0 ? 0.0 : (double) getSum(numbers) / numbers.length;
	}
	
	
	
	// Lösungen von Hausübung 5.2
		
	static int[] getReverse(int[] array) {
		if (array == null) {
			return null;
		}
		
		int[] revArray = new int[array.length];
		int count = 1;
		for (int j : array){
			revArray[array.length-count] = j;
			count++;
		}
		return revArray;
	}
		
		
	static boolean[] isEqual(int[] array1, int[] array2) {
		if (array1 == null || array2 == null) {
			System.out.println("One of the arrays does not exist");
			return null;
		}
		
		if (array1.length != array2.length) {
			System.out.println("The arrays do not have the same length");
			return null;
		}
		
		boolean[] result = new boolean[array1.length];
		for (int j=0; j<array1.length; j++) {
			result[j] = (array1[j] == array2[j]) ? true:false;
		}
		return result;
	}
	
	static boolean isSymmetric(int[] array) {
		if (array == null) {
			return false;
		}
		
		int[] revArray = getReverse(array);
		boolean[] entrysEqual = isEqual(array, revArray);
		
		boolean testb = true;
		for (boolean b : entrysEqual) {
			testb = testb & b;
		}
		return testb;
		//kürzere Alternative:
		//return (max(entrysEqual)==true && min(entrysEqual==true) ? true:false;
		
	}
		
}

