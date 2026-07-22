package day8;

import java.util.Scanner;

public class searching {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char[] arr =n.toCharArray();
        char target = input.next().charAt(0);

        if (ls(arr,target))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }
    static boolean ls(char[] arr,char target){
        for (char num:arr)
        {
            if(num == target)
            {
                return true;
            }
        }
        return false;
    }
}
