package lesson2.loops;

/**
 * Created by Михаил on 12.03.2016.
 * 
 * Найти в массиве чисел элементы с наибольшим и наименьшим значениями.
 */
import java.util.Arrays;
import java.util.Random;
public class Task6 {
    public static void main(String [] args){
        Random  r = new Random();
        int [] a = new int [r.nextInt(30)];
        for (int i = 0; i < a.length - 1; i++){
            a[i] = r.nextInt();
        }
        Arrays.sort(a);
        System.out.println("minimum value: " + a[0]);
        System.out.println("maximum value: " + a[a.length -1]);

    }
}
