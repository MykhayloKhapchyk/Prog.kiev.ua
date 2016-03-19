package lesson2.loops;

import java.util.Arrays;

/**
 * Created by Михаил on 13.03.2016.
 *
 * Написать метод для зеркального переворота  элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).
 */
public class Task9 {
    public static void main (String [] args){
        int [] a = {1, 2, 3, 4};
        arrayFromLastToFirstElement(a);
    }
    public static void arrayFromLastToFirstElement(int[] a){
        int [] a2 = new int [a.length];
        for (int i = 0; i < a.length; i++){
            a2[i] = a[a.length -1 -i];
        }
        System.out.print(Arrays.toString(a2));
    }
}

