package lesson2.loops;

/**
 * Created by Михаил on 06.03.2016.
 */
import java.util.Random;
public class Task4 {
    public static void main (String [] args){
        Random r = new Random();
        int [] a = new int [10];
        long sum = 0;
        for(int i = 0; i <a.length; i++){
            a[i] = r.nextInt();
            if(i == 0 || i == a.length - 1){
                continue;
            }
                sum += a[i];
        }
        System.out.println(sum);
    }
}

