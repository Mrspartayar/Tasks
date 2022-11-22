package codewars;

public class Main {
    public static void main(String[] args) {


        System.out.println(Kata.numberToString(3));

    }

}
class Kata {
    public static String numberToString(int num) {
        return String.valueOf(num);
//        return Integer.toString(num);
//        return ""+num;
    }
}


