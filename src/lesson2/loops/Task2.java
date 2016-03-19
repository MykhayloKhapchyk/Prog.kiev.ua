package lesson2.loops;

/**
 * Created by Михаил on 06.03.2016.
 * 
 * Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
 */
public class Task2 {
    public static void main (String [] args){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0) System.out.print(i + " ");
        }
    }
}
