package lesson2.loops;

/**
 * Created by Михаил on 05.03.2016.
 * 
 * Вывести на экран 0-й, 14-й и 27-й элементы массива.
 */
public class Task0 {
    public static void main(String [] args){
        int [] a = new int [28];
        for(int i = 0; i < a.length; i++){
            a[i] = i * 635;
        }
        System.out.print(a[0] + " " + a[14] + " " + a[27]);
    }
}
