package lesson2.arrays;

/**
 * Created by Михаил on 05.03.2016.
 *
 * Задача 1:
    1. Задать массив целых чисел длинной 10 эл.
    2. Отсортировать числа в массиве
    3. Вывести на экран результат.
    4. Сделать возможность наполнения массива с клавиатуры*.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Откуда берем масив? Введите 1 если стандартный массив или 0 - если введете его с клавиатуры");
        int check = sc.nextInt();
        if(check == 1) {
            int[] array = {1, 5, 6, 9, 20, 332, 7, 0, 44, 89};
            Arrays.sort(array);
            System.out.print(Arrays.toString(array));
        }else {
            System.out.println("Введите длину массива");
            int [] array = new int [sc.nextInt()];
            System.out.println("Вводите только ЦЕЛЫЕ значения");
            for(int i = 0; i < array.length; i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            System.out.print(Arrays.toString(array));
        }


    }
}
