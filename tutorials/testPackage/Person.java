package testPackage;

public class Person {
    public String fname;
    public String lname;
    public int age;

   /* Person() {
        this.fname = fn;
        this.lname = ln;
        this.age = a;
    }*/
    /* GETTERS */
    public String getName() {
        return (fname +" "+lname);
    }
    public int getAge() {
        return age;
    } 
}
