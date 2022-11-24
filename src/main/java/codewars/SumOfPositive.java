package codewars;

import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr) {
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                result += arr[i];
//            }
//        }
//        return result;
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;

//        return Arrays.stream(arr).filter(v -> v>0).sum();

    }
}