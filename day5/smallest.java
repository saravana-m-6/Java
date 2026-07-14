import java.util.Scanner;

public class smallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int smallest = 9;
        while(n!=0)
        {
            int pop = n%10;
            if(pop < smallest)
            {
                smallest=pop;
            }
            n= n/10;
        }
        System.out.println(smallest);
    }
}
