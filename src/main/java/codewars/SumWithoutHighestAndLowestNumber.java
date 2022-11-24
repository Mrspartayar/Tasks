package codewars;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
//        int sum = 0;
//        int min = 2147483647;
//        int max = -2147483648;
//        if (numbers != null) {
//            if (numbers.length > 1) {
//                for (int i : numbers) {
//                    if (min > i) {
//                        min = i;
//                    }
//                    if (max < i) {
//                        max = i;
//                    }
//                    sum += i;
//                }
//            }
//            return sum - max - min;
//        } else return 0;
//    }

        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }

        int min;
        int max;
        int sum;

        sum = min = max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return sum - max - min;
    }
}