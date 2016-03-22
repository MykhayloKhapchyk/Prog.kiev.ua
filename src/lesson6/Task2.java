package lesson6;

/**
 * Created by Михаил on 21.03.2016.
 *
 * Написать свой вариант ф-и Arrays.equals для short[].
 */

public class Task2 {
    public static void main(String[] args) {
        short [] a1 = {-1, 20, 33, 9};
        short [] a2 = {-1, 20, 33};
        short [] a3 = {-1, 20, 9, 33};
        short [] a4 = {-1, 20, 33, 9};
        short [] a5 = null;
        short [] a6 = null;

        boolean firstAndSecond =  equalsArray(a1, a2);
        check (firstAndSecond);
        boolean firstAndThird =  equalsArray(a1, a3);
        check (firstAndThird);
        boolean firstAndFourth = equalsArray(a1, a4);
        check (firstAndFourth);
        boolean fifthAndSix = equalsArray(a5, a6);
        check (fifthAndSix);

    }

    private static void check(boolean temp) {
        if(temp == true ) {
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays aren't equal");
        }
    }

    private static boolean equalsArray(short[] a1, short[] a2) {
        if(a1 == null && a2 == null) return true;
        if(a1.length == a2.length){

            boolean [] check = new boolean[a1.length];
            for( int i = 0; i < a1.length; i++){
                if(a1[i] == a2[i]){
                    check[i] = true;
                }else{
                    return false;
                }
            }
            return true;
        }else return false;
    }
}
