package day3;

import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if(a==b){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
