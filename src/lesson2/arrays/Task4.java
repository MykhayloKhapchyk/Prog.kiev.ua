package lesson2.arrays; /**
 * Created by Михаил on 05.03.2016.
 */

public class Task4 {
    public static void main(String [] args){
        int [] a = {1,5,6,9,20,332,7,0,44, 89};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
           sum = sum + a[i];
        }
        double avarage = (double)sum / a.length;
        System.out.print(avarage);
    }
}
