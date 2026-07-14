package HomeWork;

import java.util.Scanner;

public class RemoveZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int result =0;
        while(n!=0) {
            int pop = n % 10;
            if(pop!=0)
            {
                result = result*10+pop;
            }
            n=n/10;
        }
        int rev =0;
        while(result!=0)
        {
            int digit = result%10;
            rev = rev *10+digit;
            result=result/10;
        }
        System.out.println(rev);

    }
}

