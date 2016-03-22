package lesson6;

/**
 * Created by Михаил on 22.03.2016.
 *
 * Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран (“10” -> 2).
 */
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        String number = sc.next();
        System.out.println("Your number " + Integer.parseInt(number, 2));
    }
}
