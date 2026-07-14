package HomeWork;

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int sum = 0;
        while(n!=0)
        {
            int pop = n%10;
            sum = sum+pop;
            n=n/10;
        }
        if(n%sum==0)
        {
            System.out.println("It is harshad number");
        }
        else {
            System.out.println("It is not a harshad number");
        }
    }
}
