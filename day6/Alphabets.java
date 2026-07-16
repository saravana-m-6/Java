package day6;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        char ch = 'A';
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
