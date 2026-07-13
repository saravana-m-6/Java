import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double total = basic * 12;

        System.out.println("Annual Salary = " + total);
    }
}