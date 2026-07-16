package day6;

import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int num = 1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.printf("%4d",num);
                num++;
            }
            System.out.println();
        }
    }
}
