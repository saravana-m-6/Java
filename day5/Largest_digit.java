package day5;

import java.util.Scanner;

public class Largest_digit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int largest = 0;
        while(n!=0)
        {
            int pop = n%10;
            if(pop > largest)
            {
                largest=pop;
            }
            n= n/10;
        }
        System.out.println(largest);
    }
}
