package testPackage; 

public class Birthday {
    private int day;
    private int month;
    private int year;

    Birthday(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    } 
    /* GETTERS */
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }

    /* DATE OF BIRTH */
    public String getDob() {
        return (this.day +"-"+ this.month +"-"+ this.year);
    } 
}
