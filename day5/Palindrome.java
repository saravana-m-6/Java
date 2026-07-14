package day5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int rev = 0;
        int org = n;
        while (n != 0) {
            int pop = n % 10;
            rev = rev * 10 + pop;
            n = n / 10;
        }
        if (rev == org) {
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }
}
