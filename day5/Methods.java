package day5;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = add3();
        System.out.println(c);
    }

    // with parameter with return
    public static int add(int a, int b)
    {
        return a+b;
    }

    // without parameter without return
    public static void add1()
    {
        System.out.println("Hello");
    }

    // without parameter with return
    public static void add2(int a, int b)
    {
        System.out.println(a + b);
    }

    // without parameter with return
    public static int add3()
    {
        return 1;
    }
}