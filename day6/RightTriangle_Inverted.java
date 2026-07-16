package day6;

import java.util.Scanner;

public class RightTriangle_Inverted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

