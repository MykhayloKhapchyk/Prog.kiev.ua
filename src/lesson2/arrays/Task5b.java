package lesson2.arrays; /**
 * Created by Михаил on 05.03.2016.
 * 
 * Задачи на 5-ку 
     Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
     элементами, а затем выводить нужный элемент по его индексу на консоль.
 */
import java.util.Scanner;

public class Task5b {
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
