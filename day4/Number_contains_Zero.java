package day4;

import java.util.Scanner;

public class Number_contains_Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        while (n != 0) {
            int pop = n % 10;
            if (pop == 0) {
                System.out.println("It contains Zero");
                break;
            }
            n = n / 10;
        }
        }
    }

