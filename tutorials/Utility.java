import java.util.*;

public class Utility {
    /* Utility Class with Private constructor */
    
    private Utility() {

    }
    /* Addition */
    public static add(int a, int b) {
        return a + b;
    }
    /* Subtraction */
    public static int subt(int a, int b) {
        return a - b;
    }
    /* Multiplication */
    public static mult(int x, int y) {
        return x * y;
    }
    /* Division */
    public static double divide(int d, int v) throws ArithmeticException {
        if( v == 0 ) {
            throw ArithmeticException("Division By Zero");
        } else {
            return d/v;
        }
    }
}
