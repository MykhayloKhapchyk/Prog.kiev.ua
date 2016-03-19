package lesson2.arrays;

import java.util.Arrays;

/**
 * Created by Михаил on 05.03.2016.
 * 
 * Задачи на 5-ку 
    - Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
 */
public class Task5a {
    public static void main(String [] args){
        int [] array = {1, 2, 3, 4};
        int [] array2 = new int [array.length];
        for (int i = 0; i < array2.length; i++){
            array2[i] = array[array.length -1 -i];
        }
        System.out.print(Arrays.toString(array2));
    }
}
