package lesson2.loops;

/**
 * Created by Михаил on 13.03.2016.
 *
 *
 * Написать метод, который заполнит массив произвольного размера числами по возрастанию,
 * начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5].
 */
import java.util.Arrays;
import java.util.Scanner;
public class Task10 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array length");
        int [] a = new int [sc.nextInt()];
        arrayFill(a);
        System.out.print(Arrays.toString(a));
    }
    public static void arrayFill(int [] a) {
        for( int i = 0; i< a.length; i++ ){
            a[i] = Math.abs((a.length /2) - i) ;
        }
    }
}
