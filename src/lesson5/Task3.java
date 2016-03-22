package lesson5;

/**
 * Created by Михаил on 19.03.2016.
 *
 * Написать ф-ю, которая принимает на вход массив чисел и  возвращает его длину в байтах как результат.
 */
public class Task3 {
    public static void main(String[] args) {
        int [] a = {1, 5, 6, 9, 20, 332, 7, 0, 44, 89};
        double [] b = {1.0, 5.4, 6.2, 9.0, 20.2};
        int aLength = lengthOfArrayInByte(a);
         int bLength  = lengthOfArrayInByte(b);

        System.out.println( aLength);
        System.out.println( bLength);
    }

    private static int lengthOfArrayInByte(double[] array) {
        return array.length *8;
    }
    private static int lengthOfArrayInByte(int[] array) {
        return array.length *4;
    }
}
