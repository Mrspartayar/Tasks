package codewars;

public class GrassHoper {
    public static char getGrade(int s1, int s2, int s3) {
        int sum = (s1 + s2 + s3)/3;
        char grade = 'F';
        if (sum >= 0 && sum < 60) {
            grade='F';
        } else if (sum >= 60 && sum < 70) {
            grade='D';
        } else if (sum >= 70 && sum < 80) {
            grade='C';
        } else if (sum >= 80 && sum < 90) {
            grade= 'B';
        } else if (sum >= 90 && sum <= 100) {
            grade= 'A';
        }
        return grade;
//        s1=(s1+s2+s3)/3;
//        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
    }
}
