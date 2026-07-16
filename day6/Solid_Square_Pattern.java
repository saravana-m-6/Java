package day6;
import java.util.Scanner;

public class Solid_Square_Pattern {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
