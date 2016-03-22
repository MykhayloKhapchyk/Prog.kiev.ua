package lesson5;

import java.util.Arrays;

/**
 * Created by Михаил on 19.03.2016.
 *
 * Написать ф-ю для объединения 2-х массивов в один. Вывести  результат на консоль.
 */

public class Task4 {
    public static void main(String[] args) {
        int [] a = {1, 5, 6, 9, 20, 332, 7, 0, 44, 89};
        int [] b = {1, 5, 6, 9, 20, 332, 7, 0, 44, 89};

        addTwoArrays(a, b);
    }


    private static void addTwoArrays(int[] a, int[] b) {
        int [] temp = new int [a.length + b.length];
        for(int i = 0; i < a.length; i++){
            temp[i] = a[i];
        }
        for (int i = 0; i< b.length; i++){
            temp[i + a.length] = b[i];
        }
        System.out.print(Arrays.toString(temp));
    }
}
