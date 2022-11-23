package codewars;

public class Main {
    public static void main(String[] args) {

        int[] arr;
        arr = new int[3];

        arr[0]=3;
        arr[1]=5;
        arr[2]=-4;

        System.out.println(SumOfPositive.sum(arr));

    }

}
class Kata {
    public static String numberToString(int num) {
        return String.valueOf(num);
//        return Integer.toString(num);
//        return ""+num;
    }
}


