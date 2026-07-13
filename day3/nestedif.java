package day3;


import java.util.*;
public class nestedif {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a<b){
            if(a>60){
                if(b>60){
                    System.out.println("yes");
                }
            }
        }
        else{
            System.out.println("no");
        }

    }
}