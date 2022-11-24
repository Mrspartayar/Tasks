package codewars;

public class ReturnNegative {

    public static int makeNegative(final int x) {
        if (x > 0) {
            return x * -1;
        } else if (x < 0) {
            return x;
        }
        return 0;
        //return -abs(x);
        //return (x < 0) ? x : -x;
    }

}
