package day8;

import java.util.Scanner;

public class FindingTarget {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr =new int[n];
        int target = input.nextInt();
        for (int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        if (ls(arr, target)) {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }

    }
    static boolean ls(int[] arr,int target){
        for (int num:arr)
        {
            if(num == target)
            {
                return true;
            }
        }
        return false;
    }
}
