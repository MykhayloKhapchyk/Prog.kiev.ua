package lesson2.arrays; /**
 * Created by Михаил on 05.03.2016.
 *
 * Задача 3:
     1. Ввести с клавиатуры массив из 10 чисел.
     2. Разбить его на 2 массива равной длинны.
     3. Отсортировать каждую из половинок и вывести их содержимое на экран.
 */
import java.util.Scanner;
import java.util.Arrays;
public class Task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arrayInitial = new int[10];
        for( int i = 0; i < arrayInitial.length; i++){
            arrayInitial[i]= sc.nextInt();
        }
        int [] a1 = new int[arrayInitial.length / 2];
        int [] a2 = new int[arrayInitial.length / 2];
        for(int i = 0; i < a1.length; i++){
            a1[i] = arrayInitial[i];
            a2[i] = arrayInitial[(arrayInitial.length /2) + i];
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.print(Arrays.toString(a1));
        System.out.print(Arrays.toString(a2));
        sc.close();
    }
}
