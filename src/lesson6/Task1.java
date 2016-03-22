package lesson6;

/**
 * Created by Михаил on 20.03.2016.
 *
 * Ввести с консоли дату. Сравнить ее с текущей датой в системе. Вывести отличающиеся части (год, месяц) на экран.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        long ctm = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Enter the date: ");
        String dtStr = sc.nextLine();
        try {
            Date dt = sdf.parse(dtStr);

        } catch (ParseException e) {
            System.out.println("Wrong date!");
        }
        String currentDate = dtStr.toString();



        sc.close();
    }
}
