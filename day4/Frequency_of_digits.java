package day4;

import java.util.Scanner;
public class Frequency_of_digits {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        System.out.println("Enter a Key value:");
        int key = input.nextInt();

        int count = 0;

        while (n!=0) {
            int pop = n % 10;

            if (pop == key) {
                count++;
            }
            n = n / 10;
        }

        System.out.println("The count of the key value is : "+count);


    }
}
