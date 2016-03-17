package lesson2.loops;

/**
 * Created by Михаил on 13.03.2016.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Task8 {

    static int [] operationIndex;
    static char [] operation;
    static double [] variables;

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        readLine(a);
        countResult();

    }

    private static void countResult() {
        //вычесляем результат
        double result = variables[0];
        for(int i = 0; i< operation.length; i++){
            if(operation[i] == '+'){
                result = result + variables[i+1];
            }else if(operation[i] == '-'){
                result = result - Math.abs(variables[i+1]);
            }else if(operation[i] == '*'){
                result = result * variables[i+1];
            }else{
                result = result / variables[i+1];
            }
        }
        System.out.println(result);
    }

    private static void readLine(String a) {
        //считаем количество операций "+, -, *, /"
        int operationCounter = 0;
        for(int i = 0; i < a.length(); i++){
            char operation = a.charAt(i);
            if(operation == '+' || operation == '-' || operation == '*'|| operation == '/'){
                operationCounter++;
            }
        }
        operationIndex = new int [operationCounter];
        operation = new char[operationCounter];
        //записываем идексы операций, нужны для разделения введенной строки на переменные
        for(int j = 0; j<operationIndex.length;) {
            for(int i = 0; i < a.length(); i++){
                char ch = a.charAt(i);
                if(ch == '+' || ch == '-' || ch == '*'|| ch == '/'){
                    operationIndex[j] = i;
                    operation[j] =  ch;
                    j++;
                }
            }
        }
        //System.out.println(a);
        //System.out.println(operationCounter);
        //System.out.println(Arrays.toString(operationIndex));

        //создаем массив с переменными
        Double [] variables = new Double[operationIndex.length +1];
        int beginIndex = 0;
        for(int i = 0;  i < operationIndex.length;i++) {
            variables[i] = Double.parseDouble(a.substring(beginIndex, operationIndex[i]));
            beginIndex = operationIndex[i] + 1;

        }
        //последняя переменная в строке
        variables[variables.length-1] = Double.parseDouble(a.substring(operationIndex[operationIndex.length- 1] , a.length()));
        System.out.println(Arrays.toString(variables));
    }
}

