package day9;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(binarysearch(arr, target));
    }
    static int binarysearch(int[]arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;

            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }
}

