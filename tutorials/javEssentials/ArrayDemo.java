class ArrayDemo {
	
	public static void main(String[] args) {
		// Declares array of integers
		int[] anArray;

		// Allocates memory for 10 integers
		anArray = new int[10];
		int x = 1;

		// Initializes an array of integers
		for(int i = 0; i < 10; ++i) {

			anArray[i] = 100 * x;
			++x;

			System.out.println("Element @ index " + i+": " + anArray[i]);
		}

		// Multidimensional Array
		String[][] names = { 
			{"Mr. ", "Mrs. ", "Ms. "},
			{"Taufiq", "Gh"}
		};
		System.out.println(names[0][0] + names[1][0]);

		// Copying an Array to another Array
		char [] copyFrom = { 'T','a','u','f','i','q',' ','G','h' };
		char [] copyTo = new char[9];

		// Copy and Output Array as new String
		System.arraycopy(copyFrom, 0, copyTo, 0, 8);
		System.out.println(new String(copyTo));
	}
}
