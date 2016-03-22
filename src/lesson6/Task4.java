package lesson6;

import static java.lang.Integer.toBinaryString;

/**
 * Created by Михаил on 21.03.2016.
 *
 * Написать код, который позволит менять и читать значения  произвольных битов в массиве int-ов.
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int []a = {0, 0};

        setBit(a, 0);
        setBit(a, 1);
        setBit(a, 32);
        setBit(a, 63);

        System.out.println(isBitSet(a, 0));
        System.out.println(isBitSet(a, 1));
        System.out.println(isBitSet(a, 32));
        System.out.println(isBitSet(a, 63));
        System.out.println(isBitSet(a, 55));
        toString(a);
    }

    private static void setBit(int[] a, int pos) {
        int intN = a.length - (pos / 32) - 1;
        int binN = pos % 32;
        a[intN] = setBit(a[intN], binN);
    }
    static int setBit(int x, int pos){
        return x | (1 << pos);
    }

    static boolean isBitSet(int x, int pos){
        return (x & (1 << pos)) != 0;
    }

    static boolean isBitSet(int a[], int pos){
        int intN = a.length - (pos / 32) - 1;
        int binN = pos % 32;
        return isBitSet(a[intN], binN);
    }

    private static void toString(int[] a) {
        StringBuilder sb = new StringBuilder("[ ");
        for(int i = 0; i < a.length; i++){
            sb.append(a[i] + " ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}