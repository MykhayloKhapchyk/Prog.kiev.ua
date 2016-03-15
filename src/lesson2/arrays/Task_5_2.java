package lesson2.arrays; /**
 * Created by Михаил on 05.03.2016.
 */
import java.util.Scanner;

public class Task_5_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arrayInitial = new int[length];
        for( int i = 0; i < length; i++){
            arrayInitial[i]= sc.nextInt();
        }
        System.out.println("Input index in range from 0 to " + (arrayInitial.length - 1));
        int index = sc.nextInt();;
        while(index != -1) {
            System.out.println(arrayInitial[index]);
            System.out.println("If you want next number input index in range from 0 to " + (arrayInitial.length - 1));
            System.out.println("If you want to end programm input -1");
            index = sc.nextInt();
        }
        sc.close();
    }
}
