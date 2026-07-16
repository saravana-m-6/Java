package day6;

import java.util.Scanner;
public class ZigZag_Square {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        for (int i=1;i<=n;i++)
        {
            int num=i;
            for (int j=1;j<=n;j++)
            {
                System.out.print(num+" ");
                num = num + n;
            }

            System.out.println();
            num=num-1;
        }
    }
}
