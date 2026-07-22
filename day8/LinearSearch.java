package day8;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr =new int[n];
        int target = input.nextInt();
        for (int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println(linear_search(arr,target));
    }
    static int linear_search(int[] arr,int target){
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
