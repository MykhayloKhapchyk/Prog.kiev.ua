package lesson2.loops;

/**
 * Created by Михаил on 06.03.2016.
 */
import java.util.Arrays;
public class Task3 {
    public static void main (String [] args){
        int [] a = new int[100];
        for(int i = 0; i < 100; i++){
            a[i] = 100 - i;
        }
        System.out.print(Arrays.toString(a));
    }
}
