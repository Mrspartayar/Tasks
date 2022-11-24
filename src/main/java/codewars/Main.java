package codewars;

public class Main {
    public static void main(String[] args) {

        int[] arr;
        arr = new int[5];

        arr[0]=3;
        arr[1]=5;
        arr[2]=1;
        arr[3]=10;
        arr[4]=-5;

        int[] arr2;
        arr2 = new int[1];
        arr2[0]=4;

        System.out.println(SumWithoutHighestAndLowestNumber.sum(arr2));

    }

}
class Kata {
    public static String numberToString(int num) {
        return String.valueOf(num);
//        return Integer.toString(num);
//        return ""+num;
    }
}


