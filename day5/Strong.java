package day5;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int temp = n;
        int sum = 0;

        while (n != 0)
        {
            int digit = n % 10;
            int fact = 1;
            int i = 1;
            while(i<=digit)
            {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a Strong Number");
        } else {
            System.out.println(temp + " is Not a Strong Number");
        }
    }
}