package Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /***
         * Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if
         * n and m occur next to each other in the array (in any order).
         *
         * Input data format
         *
         * The first line contains the size of an array.
         * The second line contains elements of the array.
         * The third line contains two integer numbers n and m.
         * All numbers in the same line are separated by the space character.
         *
         * Output data format
         *
         * Only a single value: true or false.
         */

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean nAndMFollows = false;

        for (int j = 0; j < array.length; j++) {
            if (array[j] == n) {
                if (j < array.length - 1) {
                    if (array[j + 1] == m) {
                        nAndMFollows = true;
                        break;
                    }
                }
            }
        }

        for (int l = 0; l < array.length; l++) {
            if (array[l] == m) {
                if (l < array.length - 1) {
                    if (array[l + 1] == n) {
                        nAndMFollows = true;
                        break;
                    }
                }
            }
        }

        if (nAndMFollows == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
