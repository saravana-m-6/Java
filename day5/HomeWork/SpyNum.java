package HomeWork;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int pop = n % 10;
            sum = sum + pop;
            product = product * pop;
            n = n / 10;
        }
        if (sum == product) {
            System.out.println("It is a Spy Number");
        } else {
            System.out.println("It is not a Spy Number");
        }
    }
}
