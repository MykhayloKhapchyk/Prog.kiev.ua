package lesson2.arrays;

import java.util.Arrays;

/**
 * Created by Михаил on 05.03.2016.
 */
public class Task_5_1 {
    public static void main(String [] args){
        int [] array = {1, 2, 3, 4};
        int [] array2 = new int [array.length];
        for (int i = 0; i < array2.length; i++){
            array2[i] = array[array.length -1 -i];
        }
        System.out.print(Arrays.toString(array2));
    }
}
