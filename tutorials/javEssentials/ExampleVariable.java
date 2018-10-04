class ExampleVariable {

	private static String s2 = "this is another String";

	static void stdOut(boolean b) {
		System.out.println(b);
	}
	static void stdOut(char c) {
		System.out.println(c);
	}
	static void stdOut(String s) {
		System.out.println(s);
	}
	static void stdOut(int i) {
		System.out.println(i);
	}
	static void stdOut(short st) {
		System.out.println(st);
	}
	static void stdOut(long l) {
		System.out.println(l);
	}
	static void stdOut(double d) {
		System.out.println(d);
	}
	static void stdOut(byte b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {

	// Primitive Datatypes
	byte smallNumber = 3;
	short mediumNumber = 100;
	int modalNumber = 3100;
	long largeNumber = 100_000_000_000L;
	char charType = '\u00ff';
	float decimalNumber = 3.14f;
	double doubleNumber = 3e10d;
	boolean trueOrFalse = false;

	// Other types
	String s = "This is a string";

	// Integer Literals
	/* Decimal, Hexadecimal and Binary value */
	int decVal = 26;
	int hexVal = 0x1a;
	int binVal = 0b11010;

	// Floaing-Point Literals
	/* floats ends with f else double by default */
	float f1 = 1.3f;
	double d1 = 1.344;
	double d2 = 123.143e4;



		stdOut(smallNumber);
		stdOut(mediumNumber);
		stdOut(modalNumber);
		stdOut(largeNumber);
		stdOut(charType);
		stdOut(s2);
		stdOut(decimalNumber);
		stdOut(doubleNumber);
		stdOut(trueOrFalse);
		stdOut(decVal);
		stdOut(hexVal);
		stdOut(binVal);
		stdOut(d2);
	}
}
