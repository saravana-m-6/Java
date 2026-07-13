import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of ducks: ");
        int ducks = sc.nextInt();
        System.out.print("Enter eggs produced: ");
        int eggs = sc.nextInt();
        System.out.print("Enter time (minutes): ");
        int time = sc.nextInt();
        System.out.print("Enter ducks you buy: ");
        int newDucks = sc.nextInt();
        System.out.print("Enter required time (minutes): ");
        int newTime = sc.nextInt();
        int totalEggs = (newDucks * eggs * newTime) / (ducks * time);
        System.out.println("Total Eggs = " + totalEggs);
    }
}
