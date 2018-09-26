// A very Simple Example

/**
 * This class displays a text String on the console
 *
 * Lesson A
 *
 * Lesson B - Non Static fields Create Instance 
 * 	it's class before calling the getText() method
 * 	LB
 *
 * Lesson C - Static fields do not create instance of
 *
 * 	it's class before calling the getStaticText() method
 */

public class WelcomeProgram { /* class definition */

	/* Static Field (Data) */
	static String text = " ***\tWelcome to Java Programming\t***";
	/**
	 * Non-Static field 
	 *
	 * String text2 = "Non-Static Data";
	 * LB
	 *
	 */

	
	/* Methods to access data in the fields */
	// String getText() { return text2; }  - LB
	static String getStaticText() { return text; }

	/* Main Method */
	public static void main(String[] args) {

		/** Instance of WelcomeProgram */
		// WelcomeProgram progInstance = new WelcomeProgram();
		// LB

		/* Accessing Data WelcomeProgram */
		// String retrieveText = progInstance.getText();
		// LB

		String retrieveStaticText = getStaticText();

		// System.out.println(retrieveText); -LB
		System.out.println(retrieveStaticText);
	}
}
