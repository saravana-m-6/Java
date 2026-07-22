package day10;

import java.util.Scanner;
public class tring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = "Hello World";
        String str2 = ("Hello");
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        String str4= "";
        String str5= new String();
        StringBuilder sb =new StringBuilder("Hello");
        String str6=sb.toString();
        System.out.println(str1.replaceFirst("Hello", "Hi"));
        System.out.println(str1.contains("Hi"));
    }
}
