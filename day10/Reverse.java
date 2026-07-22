package day10;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        char[] arr = name.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String rev = new String(arr);
        System.out.println(rev);
    }
}