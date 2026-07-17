package day7;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= input.nextInt();
        }
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i=0;i<n;i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
