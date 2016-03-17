package lesson2.arrays; /**
 * Created by Михаил on 05.03.2016.
 */
import java.util.Arrays;
public class Task2 {
    public static void main(String [] args){
        int [] a = {1,5,6,9,20,332,7,0,44, 89};
        Arrays.sort(a);
        int temp = a[a.length -1];
        a[a.length -1] = a[0];
        a[0] = temp;
        System.out.print(Arrays.toString(a));
    }
}
