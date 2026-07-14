package HomeWork;
import java.util.Scanner;
public class FirstLastDigitSum_1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int ld = n%10;
        int rev = 0;
        while(n!=0)
        {
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        int fd = rev%10;
        int sum = ld+fd;
        System.out.println(sum);

    }
}
