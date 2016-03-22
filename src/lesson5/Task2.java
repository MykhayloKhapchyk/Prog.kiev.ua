package lesson5;

/**
 * Created by Михаил on 19.03.2016.
 *
 * Написать функцию, которая принимает массив чисел в качестве  аргумента, увеличивает его первые 3 элемента на 1 и
 * возвращает их сумму как результат. После изменения массив и  сумму надо вывести на экран.
 */
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        int [] a = {1, 5, 6, 9, 20, 332, 7, 0, 44, 89};
        test(a);
    }

    private static void test(int[] a) {
        int sum = 0;
        for (int i = 0; i < 3; i++){
            a[i] += 1;
            sum = sum + a[i];
        }
        System.out.println("Sum of 3 first element: " +sum);
        System.out.println(Arrays.toString(a));
    }

}
