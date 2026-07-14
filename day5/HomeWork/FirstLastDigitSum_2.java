package HomeWork;

import java.util.Scanner;

public class FirstLastDigitSum_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int ld = n % 10;
        while (n>=10)
        {
            n = n / 10;
        }
        int fd = n;
        int sum = ld+fd;
        System.out.println(sum);
    }
}

