class Comments {
	// Comments in Java Programming Language
	// Single Line Comment
	public static void main(String[ ] args) {
		int n = 4;
		int i = 3;

		/* 
		 * Multiple Line Comments
		 * Spans Multiple Lines
		 *
		 */

		StdOut(n + i);
	}

	/**
	 * Javadoc Comments
	 * StdOut()
	 * @param 
	 *
	 */

	static void StdOut(String str) {
		System.out.println(str);
	}
	static void StdOut(double dbl){
		System.out.println(dbl);
	}
	static void StdOut(int in) {
		System.out.println(in);
	}
}
