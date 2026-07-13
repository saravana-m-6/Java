package day2;

import java.util.*;
public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        boolean c=(a>5)&&(b>5);
        System.out.println(c);
        System.out.println(a>5||b>5);
        System.out.println(!(a>b));
    }
}