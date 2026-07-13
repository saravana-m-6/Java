package day4;
import java.util.Scanner;
import java.util.Random;
public class do_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int key = rand.nextInt(100);
        int guess;

        do {
            System.out.println("Enter the value of your guess:");
            guess = input.nextInt();

            if (guess > key) {
                System.out.println("Guess is too high");
            } else if (guess < key) {
                System.out.println("Guess is too low");
            }

        } while (key != guess);

        System.out.println("You guessed it!");
    }
}