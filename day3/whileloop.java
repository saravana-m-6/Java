package day3;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while(num>0){
            System.out.print(num+ " ");
            num--;
        }
    }
}
