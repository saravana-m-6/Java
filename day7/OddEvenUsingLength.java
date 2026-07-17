package day7;

import java.util.Scanner;
public class OddEvenUsingLength {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]= input.nextInt();
            }
            int oddsum=0;
            int evensum=0;
            for(int num:arr)
            {
                int org=num;
                int sum =0;
                while(num!=0)
                {
                    int pop =num%10;
                    sum+=pop;
                    num/=10;
                }
                if (sum % 2 == 0) {
                    evensum+=org;
                }
                else {
                    oddsum+=org;
                }
            }
            System.out.println(evensum);
            System.out.println(oddsum);
        }
    }

