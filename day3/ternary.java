package day3;

import java.util.Scanner;

public class ternary {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            String number = (num%2==0)? "even" : "odd";
            System.out.println(number);


        }
    }


