package lesson2.loops;

/**
 * Created by Михаил on 05.03.2016.
 *
 * Вывести на экран числа от 10 до 20 с помощью всех известных циклов.
 */
public class Task1 {
    public static void main(String [] args){
        for(int i = 10; i <= 20; i++)
        System.out.print(i + " ");
        System.out.println();
        int i = 10;
        while(i<= 20) System.out.print(i++ + " ");
        System.out.println();
        i = 10;
        do{ System.out.print(i++ + " ");} while( i<= 20);

    }
}
