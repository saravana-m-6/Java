package day5;

import java.util.Scanner;

public class StrongUsingMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isStrong(n)) {
            System.out.println("It is a Strong number");
        } else {
            System.out.println("It is not a Strong number");
        }
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int pop = n % 10;
            sum = sum + fact(pop);
            n = n/10;
        }
        return sum==temp;
    }

    public static int fact(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;

    }
}

