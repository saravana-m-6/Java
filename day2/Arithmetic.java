package day2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c=a+b;
        System.out.println("add:"+c);
        c=0;
        c=a-b;
        System.out.println("sub:"+c);
        c=0;
        c=a*b;
        System.out.println("mul:"+c);
        c=0;
        c=a/b;
        System.out.println("div:"+c);
        c=0;
        c=a%b;
        System.out.println("result:"+c);
        c=a/b;
        System.out.println("result:"+c);
        c=++a;
        System.out.println("result:"+c);
        c=b+=3;
        System.out.println("result:"+c);

    }
}