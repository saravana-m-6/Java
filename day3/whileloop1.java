package day3;

import java.util.Scanner;

public class whileloop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rev=0;
        while(num!=0){
            int pop=num%10;
            rev=rev*10+pop;
            num=num/10;

        }
        System.out.println(rev);
    }
}
