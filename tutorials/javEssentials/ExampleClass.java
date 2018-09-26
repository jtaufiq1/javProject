public class ExampleClass {
	
	String text;
	/**
	 * class contructor 
	 * Initialize fields with Constructor
	 *
	 * Lesson D - Initialize with constructor (No Args)
	 * Lesson E - Initialize with constructor (Args) 
	 *
	 */
	public ExampleClass() {
		// LD
		text = "\t*** Simple Class Constructor ***";
	}
	public ExampleClass(String message) {
		// LE
		text = message;
	}

	/* Non-static Accessor Method */
	String getText() {
		return text;
	}

	/* Main method */
	public static void main(String[] args) {

		/*
		 * Instance of Example Class Initializes 
		 * Field with constructor
		 *
		 */
		ExampleClass progInst = new ExampleClass("Message Passed To Constructor");
		String retrievedText = progInst.getText();

		System.out.println(retrievedText);
	}
}	
