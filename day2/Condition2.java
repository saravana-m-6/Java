import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();
        System.out.println("Enter Mark 4: ");
        int m4 = sc.nextInt();
        System.out.println("Enter Mark 5: ");
        int m5 = sc.nextInt();
        double avg = (m1 + m2 + m3 + m4 + m5) / 5.0;

        System.out.println("Average = " + avg);
    }
}