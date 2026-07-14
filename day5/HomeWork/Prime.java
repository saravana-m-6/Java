package HomeWork;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int count=0;
        int i = 1;
        while(i<=n)
        {
            if(n%i==0)
            {
                count++;
            }
            i++;
        }
        if (count==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}
