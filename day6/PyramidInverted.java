package day6;

import java.util.Scanner;

public class PyramidInverted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
