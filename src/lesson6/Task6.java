package lesson6;

/**
 * Created by Михаил on 22.03.2016.
 *
 * Ввести с консоли целое число. Посчитать количество единиц в его бинарном представлении (“1011” –> 3).
 */
import static java.lang.Integer.toBinaryString;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        String number = toBinaryString(sc.nextInt());
        int counter = 0;
        for(int i = 0; i < number.length(); i++){
            if(number.substring(i, i + 1).equals("1")){
               counter++;
            }
        }
        System.out.println(counter);
    }
}
