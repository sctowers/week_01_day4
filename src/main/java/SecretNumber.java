import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

        System.out.println("What is the secret number?");

        Scanner sc = new Scanner(System.in);
        int guessedNumber = sc.nextInt();

        if (guessedNumber == 8) {
            System.out.println("Correct!");
        } else if (guessedNumber < 8) {
            System.out.println("Too low");
        } else if (guessedNumber > 8) {
            System.out.println("Too high");
        }
    }

}
