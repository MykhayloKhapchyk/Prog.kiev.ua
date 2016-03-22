package lesson6;

/**
 * Created by Михаил on 21.03.2016.
 *
 * Написать свой вариант ф-и Arrays.toString() для int[].
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] a = new  int [10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = r.nextInt();
        }
        toString(a);
    }

    private static void toString(int[] a) {
        StringBuilder sb = new StringBuilder("[ ");
        for(int i = 0; i < a.length; i++){
            sb.append(a[i] + " ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
