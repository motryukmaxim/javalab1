import java.util.Scanner;
import java.io.*;

public class Main {

   static Scanner scanner = new Scanner(System.in);

        public static void main(String args[]) {


            int number;

            do {
                System.out.println("print number apartment");
                number = scanner.nextInt();

            } while (number < 1 || number > 45);
            switch (number) {
                case 1: case 2: case 3: case 4: case 5:
                    System.out.println("1 floor");
                    break;
                case 6: case 7: case 8: case 9: case 10:
                    System.out.println("2 floor");
                    break;
                case 11: case 12: case 13: case 14: case 15:
                    System.out.println("3 floor");
                    break;
                case 16: case 17: case 18: case 19: case 20:
                    System.out.println("4 floor");
                    break;
                case 21: case 22: case 23: case 24: case 25:
                    System.out.println("5 floor");
                    break;
                case 26: case 27: case 28: case 29: case 30:
                    System.out.println("6 floor");
                    break;
                case 31: case 32: case 33: case 34: case 35:
                    System.out.println("7 floor");
                    break;
                case 36: case 37: case 38: case 39: case 40:
                    System.out.println("8 floor");
                    break;
                case 41: case 42: case 43: case 44: case 45:
                    System.out.println("9 floor");
                    break;


            }
        }
        }





