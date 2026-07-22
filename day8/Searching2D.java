package day8;

import java.util.Scanner;

public class Searching2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int target = input.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        if (ls(arr, target)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
    static boolean ls(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}

