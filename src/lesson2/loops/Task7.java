package lesson2.loops;

/**
 * Created by Михаил on 12.03.2016.
 */
import java.util.Random;
import java.util.Arrays;
public class Task7 {
    public static void main (String [] args) {
        Random r = new Random();
        int max = 0;
        int[] a = new int[20 + r.nextInt(25)];
        int[] numbers = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(35);
        }

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1; j++) {
                if (a[i] == a[j]) numbers[i]++;
            }


            for (int k = 0; k <= a.length - 1; k++) {
                if (numbers[k] > max) {
                    max = numbers[k];
                }
            }

        }
        System.out.println(Arrays.toString(a));
        System.out.println("Самое повторяющееся число: " + numbers[max] + "\n" + "Число повторов: " + max + " раз");
    }}
