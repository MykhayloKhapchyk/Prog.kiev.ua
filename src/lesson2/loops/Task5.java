package lesson2.loops;

/**
 * Created by Михаил on 14.03.2016.
 * 
 * Написать игру «Крестики нолики» используя двухмерные массивы.
 */
import java.util.Random;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String[][] ticTac = new String[3][3];
        fillArray(ticTac);
        boolean end = false;
        int moveCounter = 0;
        int player = r.nextInt(2);// если 1, игрок "х", если 0, то игрок "0";
        String ch = "";
        if (player == 1) {
            System.out.println("You play as 'X'");
            while (end == false){
                showGrid(ticTac);
                System.out.println();

                playerMove(ticTac, sc, "  X  ");
                showGrid(ticTac);
                ch = check(ticTac);
                end  = forXGame(ch, end);
                if(end == true){
                    break;
                }

                System.out.println();
                computerMove(ticTac, r, "  0  ");
                ch = check(ticTac);
                end = forXGame(ch, end);
                if(end == true){
                    break;
                }

            }
        }else{
            System.out.println("You play as '0'");
            while (end == false) {
                showGrid(ticTac);
                System.out.println();

                computerMove(ticTac, r, "  X  ");
                showGrid(ticTac);
                ch = check(ticTac);
                end  = for0Game(ch, end);
                if(end == true){
                    break;
                }

                System.out.println();
                playerMove(ticTac, sc, "  0  ");
                ch = check(ticTac);
                end  = for0Game(ch, end);
                if(end == true){
                    break;
                }
            }
        }
    }

    private static boolean forXGame(String ch, boolean end) {
        if(ch == "X"){
            System.out.println();
            System.out.println("You win! Congratulations");

            return true;
        }else if(ch == "0"){
            System.out.println();
            System.out.println("Sorry, but you lose.");
            System.out.println("If you want to try again - please restart the program");
            return true;

        }
        return false;
    }

    private static boolean for0Game(String ch, boolean end) {
        if(ch == "0"){
            System.out.println();
            System.out.println("You win! Congratulations");

            return true;
        }else if(ch == "X"){
            System.out.println();
            System.out.println("Sorry, but you lose.");
            System.out.println("If you want to try again - please restart the program");
            return true;

        }
        return false;
    }

    private static void fillArray(String[][] ticTac) {
        for(int i= 0; i < 3; i++){
            for(int j =0; j < 3; j++){
                ticTac[i][j]= "empty";
            }
        }
    }

    private static void showGrid(String [][] ticTac) {
       System.out.println("    "+"  0  " + "  " + "  1  " + "  " + "  2  ");
       System.out.println("0 "+ "  " + ticTac[0][0] + "  " + ticTac[0][1] + "  " + ticTac[0][2] + "  ");
       System.out.println("1 "+ "  " + ticTac[1][0] + "  " + ticTac[1][1] + "  " + ticTac[1][2] + "  ");
       System.out.println("2 "+ "  " + ticTac[2][0] + "  " + ticTac[2][1] + "  " + ticTac[2][2] + "  ");
    }

    private static void playerMove(String [][] ticTac, Scanner sc, String s) {
        boolean freePosition = true;
        while(freePosition) {
            System.out.println("Please input cell position. First input horizontal position, next input vertical position." +
                    "Please input position from 0 to 2 ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println();
            if (ticTac [x][y] != "empty"){
                System.out.println("Position that you select is already occupied. Please try again");

            }else{
                ticTac[x][y] = s;
                freePosition = false;
            }
        }
    }

    private static void computerMove(String [][] ticTac, Random r, String s) {
        boolean move = true;
        while (move){
            int x = r.nextInt(3);
            int y = r.nextInt(3);
            if (ticTac [x][y] == "empty"){
                ticTac [x][y] = s;
                move = false;
            }
        }

    }

    private static String check(String [][] ticTac) {
        String temp = diagonal(ticTac);
        if (temp == "X" || temp == "0") {
            return temp;
        } else {
            temp = lines(ticTac);
            if (temp == "X" || temp == "0") {
                return temp;
            } else {
                temp = rows(ticTac);
                return temp;

            }
        }
    }

    private static String rows(String[][] ticTac) {
        for (int j = 0; j < ticTac.length; j++) {
            if (ticTac[0][j] == "  X  " && ticTac[1][j] == "  X  " && ticTac[2][j] == "  X  ") {

                return "X";
            } else if (ticTac[0][j] == "  0  " && ticTac[1][j] == "  0  " && ticTac[2][j] == "  0  ") {

                return "0";
            }
        }
        return "continue";
    }

    private static String lines(String[][] ticTac) {
        for (int i = 0; i < ticTac.length; i++){
            if(ticTac[i][0] == "  X  " && ticTac[i][1] == "  X  " && ticTac[i][2] == "  X  " ){

                return "X";

            }else if (ticTac[i][0] == "  0  " && ticTac[i][1] == "  0  " && ticTac[i][2] == "  0  "){

                return "0";
            }

        }
        return "continue";
    }

    private static String diagonal(String[][] ticTac) {
        if(ticTac[0][0] == "  X  " && ticTac[1][1] == "  X  " && ticTac[2][2] == "  X  "){

            return "X";

        }else if(ticTac[2][0] == "  X  " && ticTac[1][1] == "  X  " && ticTac[0][2] == "  X  "){

            return "X";

        }else if (ticTac[0][0] == "  0  " && ticTac[1][1] == "  0  " && ticTac[2][2] == "  0  "){

            return "0";

        }else if (ticTac[2][0] == "  0  " && ticTac[1][1] == "  0  " && ticTac[0][2] == "  0  "){

            return "0";
        }
        return "continue";
    }
}
