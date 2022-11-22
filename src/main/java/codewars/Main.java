package codewars;

public class Main {
    public static void main(String[] args) {


        System.out.println(Kata.numberToString(3));

    }

}
class Kata {
    public static String numberToString(int num) {
        num = 3;
        String str = Integer.toString(num);
        return str;
        // Return a string of the number here!
    }
}


