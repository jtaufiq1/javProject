package person;

public class Person {
    private String fname;
    private String lname;
    private final static int currentYear = 2018;
    private Birthday birthday;

    Person() {}
    public Person(String fn, String ln, Birthday bday) {
        this.fname = fn;
        this.lname = ln;
	this.birthday = bday;
    }

    /* Getters And Setters */
    public void setName(String fn, String ln) {

	    this.fname =fn;
	    this.lname = ln;
    }

    public String getName() { return (fname +" "+lname); }
    
    public int getAge() { return currentYear - birthday.getYear(); }

    public void personInfo() {
	    System.out.println(getName());
	    System.out.println(getAge());
    }
}
