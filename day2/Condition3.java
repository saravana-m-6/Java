import java.util.Scanner;

public class Condition3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Credit Score: ");
        int credit = sc.nextInt();

        String result = (salary >= 30000 && credit >= 700) ? "Loan Approved" : "Loan Rejected";

        System.out.println(result);
    }
}