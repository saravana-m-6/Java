package HomeWork;

import java.util.Scanner;

public class Automorphic2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int temp = n;
        int sqr = n*n;

        int divisor = 1;

        while (n!=0)
        {
            divisor = divisor * 10;
            n = n/10;
        }

        if (sqr % divisor == temp)
        {
            System.out.println("It is an Automorphic Number");
        } else {
            System.out.println("It is not an Automorphic Number");
        }
    }
}