import java.util.Scanner;

public class Condition8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hours: ");
        int hours = sc.nextInt();

        int seconds = hours * 3600;

        System.out.println("Seconds = " + seconds);
    }
}