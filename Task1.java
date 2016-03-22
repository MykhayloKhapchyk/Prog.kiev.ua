package lesson5;

/**
 * Created by Михаил on 19.03.2016.
 *
 * Написать функцию, которая принимает в качестве аргументов  одну строку X, целое число Y и число с плавающей точкой Z
 * и возвращает как результат строку в виде  S = x + y + z.
 */
public class Task1 {
    public static void main(String[] args) {
        String a = "Some line to add";
        System.out.print(test(a, 10, 25.2));
    }
    static String test(String s, int i, double j){
        String temp1 = Integer.toString(i);
        String temp2 = Double.toString(j);
        return s + " " + temp1 +" " + temp2;
    }
}
