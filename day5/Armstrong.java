package day5;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tha number");
        int n = input.nextInt();
        int org =n;
        int count = 0;
        while(n!=0)
        {
            int pop = n%10;
            count++;
            n=n/10;
        }
        n=org;
        int sum = 0;
        while(n!=0)
        {
            int digit = n%10;
            int result = 1;
            int i =1;
            while(i<=count)
            {
                result = result*digit;
                i++;
            }
            sum=sum+result;
            n= n/10;

        }
        System.out.println(sum);

        if(sum==org)
        {
            System.out.println("It is a Armstrong  Number");
        }
        else {
            System.out.println("It is not a Armstrong Number");
        }

    }
}
