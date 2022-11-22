package codewars;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if (number%2==0) {
            return new String("Even");
        }
        return new String("Odd");

        //return (number%2 == 0) ? "Even" : "Odd";
    }
}
