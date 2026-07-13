package day1;

import java.util.*;
public class Main2{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a integer:");
        int num1=input.nextInt();
        System.out.println("the integer is:"+num1);

        System.out.println("enter a byte:");
        int num2=input.nextByte();
        System.out.println(" the byte is:"+num2);

        System.out.println("enter the short:");
        short num3=input.nextShort();
        System.out.println("the short is:"+num3);

        System.out.println("enter a long:");
        long num4=input.nextLong();
        System.out.println("the long is:"+num4);


        System.out.println("enter the char:");
        char name=input.next().charAt(0);
        System.out.println("the char is:"+name);

        System.out.println("enter the float:");
        float num6=input.nextFloat();
        System.out.println("the float is:"+num6);

        System.out.println("enter a double:");
        double num7=input.nextDouble();
        System.out.println("The double is:"+num7);

        System.out.println("enter a String:");
        String name1=input.next();
        System.out.println("the string is:"+name1);



    }

} 