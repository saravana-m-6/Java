package day7;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] id = new int[5];
        String [] name = new String[5];
        char [] name1 = new char[5];

        for(int i=0;i<5;i++)
        {
            String n = input.next();
            name[i] = n;
        }
        for (String str :name)
        {
            System.out.println(str);
        }
        for (int i=0;i<5;i++)
        {
            char name2 = input.next().charAt(0);
            name1[i] = name2;
        }
        for(char i:name1)
        {
            System.out.println(i);
        }

    }
}
