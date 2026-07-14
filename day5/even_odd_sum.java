package day5;

import java.util.Scanner;

public class even_odd_sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = input.nextInt();
        int sum = 0;
        int evensum = 0;
        int oddsum = 0;
        while(n!=0)
        {
            int pop = n%10;
            if(pop%2==0)
            {
                evensum+=pop;
            }
            else {
                oddsum+=pop;
            }
            sum+=pop;
            n=n/10;
        }
        System.out.println("EvenSum: "+evensum);
        System.out.println("OddSum: "+oddsum);
        System.out.println("Sum: "+sum);

    }
}
