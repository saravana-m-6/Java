package day8;

import java.util.Scanner;
public class Selection_sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min] = temp;
            }

            }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

