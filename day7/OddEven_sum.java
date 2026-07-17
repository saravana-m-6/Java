package day7;

import java.util.Scanner;
public class OddEven_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= input.nextInt();
        }
        int evensum =0;
        int oddsum =0;
        for(int num:arr) {
            if (num % 2 == 0) {
                evensum = evensum + num;
            } else {
                oddsum = oddsum + num;
            }
        }

        System.out.println(evensum);
        System.out.println(oddsum);

        }
    }
