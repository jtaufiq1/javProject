/* Static Class and functions */
public class Counter {
    static int count = 0;
    static void counter() {
        count++;
    }
    public static void main(String[] args) {
        // Calling Static function 
        for(int i = 0; i < 5; ++i) {
            counter();
            System.out.println(count);
        }
    }
}
