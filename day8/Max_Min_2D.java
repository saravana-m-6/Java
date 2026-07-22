package day8;

import java.util.Scanner;

public class Max_Min_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
//        int target = input.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Max"+max);
        System.out.println("Min"+min);
    }
}

