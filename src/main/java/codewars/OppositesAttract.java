package codewars;

public class OppositesAttract {

    public static boolean isLove(int flower1, int flower2) {


        return ((flower1%2 != 0 && flower2%2 == 0) || (flower1%2 == 0 && flower2%2 != 0));

        //return flower1 % 2 != flower2 % 2;
        //return (flower1+flower2)%2!=0;
    }
}
