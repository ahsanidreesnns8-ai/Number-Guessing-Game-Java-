import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretno = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("====================================");
        System.out.println("        Number Guessing Game        ");
        System.out.println("====================================");

        System.out.println();
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess it?\n");

        System.out.println("Let's Start!\n");

        while (true)
        {
            attempts++;

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            int diff = Math.abs(secretno - guess);

            if (guess == secretno)
            {
                System.out.println("\nCongratulations!!!");
                System.out.println("The secret number was: " + secretno);
                System.out.println("You guessed the number in " + attempts + " attempts.");
                break;
            }
            else if (diff <= 3 && guess < secretno)
            {
                System.out.println("Attempts: " + attempts);
                System.out.println("Extremely close. Just a little bit higher.\n");
            }
            else if (diff <= 3 && guess > secretno)
            {
                System.out.println("Attempts: " + attempts);
                System.out.println("Extremely close. Just a little bit lower.\n");
            }
            else if (diff <= 5 && guess < secretno)
            {
                System.out.println("Attempts: " + attempts);
                System.out.println("Too close. Just a little higher.\n");
            }
            else if (diff <= 5 && guess > secretno)
            {
                System.out.println("Attempts: " + attempts);
                System.out.println("Too close. Just a little lower.\n");
            }
            else if (guess < secretno)
            {
                System.out.println("Attempts: " + attempts);
                System.out.println("Too Low.\n");
            }
            else
            {
                System.out.println("Attempts: " + attempts);
                System.out.println("Too High.\n");
            }
        }
        sc.close();
    }
}