package HomeWork;

import java.util.Scanner;

public class Automorphic1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int temp =n;
        int sqr = n * n;
        int count =0;
        while (n!=0)
        {
            int pop = n%10;
            count++;
            n=n/10;
        }
        int result = 0;
        while(count!=0)
        {
            int digit = sqr%10;
            result = result*10+digit;
            sqr=sqr/10;
            count--;
        }
        int rev =0;
        while(result!=0)
        {
            int digit = result%10;
            rev = rev *10+digit;
            result=result/10;
        }
        System.out.println(rev);
        if(rev==temp)
        {
            System.out.println("It is Automorphic number");
        }
        else {
            System.out.println("It is not a Automorphic number");
        }
    }
}
