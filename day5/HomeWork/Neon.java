package HomeWork;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int sqr = n * n;
        int sum = 0;
        while (sqr!= 0) {
            int pop = sqr % 10;
            sum = sum + pop;
            sqr = sqr / 10;
        }
        if (sum == n) {
            System.out.println("It is Neon number");
        } else {
            System.out.println("It is not a Neon number");
        }
    }
}