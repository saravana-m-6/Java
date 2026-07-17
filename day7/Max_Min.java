package day7;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] id = {2, 3, 4, 10, 5, 6, 1, 7, 8, 9};

        int max = id[0];
        int min = id[0];

        for (int num : id)
        {
            if (num > max)
            {
                max = num;
            }
            else if (num < min)
            {
                min = num;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}